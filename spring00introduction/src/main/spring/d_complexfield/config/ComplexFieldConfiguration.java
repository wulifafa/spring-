package spring.d_complexfield.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import spring.d_complexfield.bean.Person;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author LF
 * @Date 2020/10/27
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
@Configuration
@ComponentScan("spring.d_complexfield.bean")
public class ComplexFieldConfiguration {

    @Bean
    @Primary //指定默认bean 在一个应用中一个类型的bean只能有他一个 @Qualifer不受primary干扰
    public Person master(){
        Person master=new Person();
        master.setName("master");
        return master;
    }
}
