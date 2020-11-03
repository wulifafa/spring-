package spring.bean.a_type.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.bean.a_type.Bean.Ball;
import spring.bean.a_type.Bean.Child;
import spring.bean.a_type.Bean.Toy;
import spring.bean.a_type.ToyFactoryBean;

/**
 * FactoryBean本身是一个接口，它本身是一个创建对象的工厂。
 * 如果Bean实现了Factory接口，则它本身一个普通bean，不会在实际的业务
 * 逻辑中起作用，而由创建的对象来起作用
 * @author LF
 * @Date 2020/11/2
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
@Configuration
public class ToyConfig {

    @Bean
    public Child child() {
        return new Child();
    }

    @Bean
    public ToyFactoryBean toyFactory() {
        ToyFactoryBean toyFactory = new ToyFactoryBean();
        toyFactory.setChild(child());
        return toyFactory;
    }

//    @Bean
//    public Toy ball(){
//        return new Ball("ball");
//    }
}
