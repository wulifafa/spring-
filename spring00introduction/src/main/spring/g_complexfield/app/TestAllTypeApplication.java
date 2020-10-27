package spring.g_complexfield.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.g_complexfield.bean.Person;

public class TestAllTypeApplication {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("basic_dl/g_complexfield/autowiredforalltype.xml");
        System.out.println(ctx.getBean(Person.class));
    }
}
