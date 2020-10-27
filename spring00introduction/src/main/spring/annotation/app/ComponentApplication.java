package spring.annotation.app;

import basic_dl.a_quickstart_set.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.annotation.bean.Student;
import spring.annotation.config.ComponentScanConfiguration;

import java.util.stream.Stream;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author LF
 * @Date 2020/10/27
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
public class ComponentApplication {
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(ComponentScanConfiguration.class);

        String[] beanNames=ctx.getBeanDefinitionNames();
        Stream.of(beanNames).forEach(System.out::println);
        System.out.println(ctx.getBean(Student.class));

        //xml 引入注解 @Configuartion内部其实也是@Component 也会被注册到ioc容器中
        ApplicationContext ctx1=new ClassPathXmlApplicationContext("annotation/annotation.xml");
        Person person=ctx1.getBean(Person.class);
        System.out.println(person);
    }
}
