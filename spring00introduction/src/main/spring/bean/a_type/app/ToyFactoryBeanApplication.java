package spring.bean.a_type.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.annotation.app.AnnotationConfigApplication;
import spring.bean.a_type.Bean.Toy;
import spring.bean.a_type.config.ToyConfig;

import java.util.Map;

/**
 * BeanFactory和FactroyBean的区别
 * BeanFactory:springFramework中实现IOC的最底层容器
 * FactoryBean:创建对象的工厂Bean,可以使用它来直接创建一些初始化流程比较复杂的对象
 * @author LF
 * @Date 2020/11/2
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
public class ToyFactoryBeanApplication {

    public static void main(String[] args) {
        ApplicationContext ctx= new AnnotationConfigApplicationContext(ToyConfig.class);
//        Toy toy=ctx.getBean(Toy.class);

        //放开ToyConfig注解，打印ioc容器中2个toy，Factory创建的bean是直接放在ioc容器中
//        Map<String,Toy> toys=ctx.getBeansOfType(Toy.class);
//        toys.forEach((name,toy)->{
//            System.out.println("toy name : " + name + ", " + toy.toString());
//        });

        //Factory有个默认方法isSingleton 默认是true 代表默认单实例
        Toy toy1=ctx.getBean(Toy.class);
        Toy toy2=ctx.getBean(Toy.class);
        System.out.println(toy1==toy2);

        //取的是生产出的bean
        System.out.println(ctx.getBean("toyFactory"));
        //取出FactoryBean
        System.out.println(ctx.getBean("&toyFactory"));
    }
}
