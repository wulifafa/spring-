package spring.lifecycle.a_initmethod.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.lifecycle.a_initmethod.bean.Dog;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author LF
 * @Date 2020/11/4
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
@Configuration
public class InitMethodConfig {

    //初始化销毁方法要求特征(springFramework 底层反射调用)
    //方法访问权限无限制，方法无参数，方法无返回值，可以抛出异常
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Dog dog(){
        Dog dog=new Dog();
        dog.setName("wangwang");
        return dog;
    }
}
