package spring.annotation.config;

import basic_dl.a_quickstart_set.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
public class QuickstartConfiguration {

    @Bean(name = "aaa")
    public Person person(){
        Person person=new Person();
        person.setAge("16");
        person.setName("lf");
        return person;
    }


}
