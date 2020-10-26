package com.lf;

import javax.jws.Oneway;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author LF
 * @Date 2020/10/26
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
public class BeanFactory {

    private static Properties properties;

    private static Map<String,Object> beanMap=new HashMap<>();

    static {
        properties = new Properties();
    try {
        properties.load(BeanFactory.class.getClassLoader().getResourceAsStream("factory.properties"));
    }catch (Exception e){
        throw new ExceptionInInitializerError("BeanFactory initialize error cause:"+e.getMessage());
        }
    }

    public static Object getReflectBean(String beanName){
       // return new DemoDaoImpl();
//        try {
//            return (DemoDao) Class.forName("com.lf.dao.impl.DemoDaoImpl").newInstance();
//        }catch (Exception e){
//            e.printStackTrace();
//            throw new RuntimeException("DemoDao instantiation error, cause:"+e.getMessage());
//        }
        try {
            Class<?> beanClazz = Class.forName(properties.getProperty("demoDao"));
            return  beanClazz.newInstance();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("BeanFactory have not [" + beanName + "] bean!", e);
        } catch (IllegalAccessException | InstantiationException e) {
            throw new RuntimeException("[" + beanName + "] instantiation error!", e);
        }
    }


    public static Object getBean(String beanName){
        //双检锁保证beanmap中确实没有beanname对应的对象
        if (!beanMap.containsKey(beanName)){
            synchronized (BeanFactory.class){
                if (!beanMap.containsKey(beanName)){
                    try {
                        Class<?> beanClazz=Class.forName(properties.getProperty(beanName));
                        Object bean = beanClazz.newInstance();
                        //反射创建后放入缓存再返回
                        beanMap.put(beanName, bean);
                    }catch (ClassNotFoundException e) {
                        throw new RuntimeException("BeanFactory have not [" + beanName + "] bean!", e);
                    } catch (IllegalAccessException | InstantiationException e) {
                        throw new RuntimeException("[" + beanName + "] instantiation error!", e);
                    }
                }
            }
        }
        return beanMap.get(beanName);
    }
}
