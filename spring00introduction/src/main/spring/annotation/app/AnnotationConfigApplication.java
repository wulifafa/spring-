package spring.annotation.app;

import basic_dl.a_quickstart_set.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.annotation.config.ComponentScanConfiguration;
import spring.annotation.config.QuickstartConfiguration;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author LF
 * @Date 2020/10/27
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
public class AnnotationConfigApplication {

    public static void main(String[] args) {
//        ApplicationContext ctx=new AnnotationConfigApplicationContext(QuickstartConfiguration.class);
//        Person person=ctx.getBean(Person.class);
//        System.out.println(person);

        ApplicationContext ctx1=new AnnotationConfigApplicationContext(ComponentScanConfiguration.class);
        Person person1 =ctx1.getBean(Person.class);
        System.out.println(person1);
    }
}
