package spring.bean.a_type.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.bean.a_type.Bean.Child;
import spring.bean.a_type.ToyFactoryBean;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author LF
 * @Date 2020/11/2
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
@Configuration
public class ToyConfig {

    @Bean
    public Child child(){
        return new Child();
    }

    @Bean
    public ToyFactoryBean toyFactoryBean(){
        ToyFactoryBean toyFactoryBean=new ToyFactoryBean();
        toyFactoryBean.setChild(child());
        return toyFactoryBean;
    }
}
