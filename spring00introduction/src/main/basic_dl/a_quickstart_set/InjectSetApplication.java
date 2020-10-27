package basic_dl.a_quickstart_set;

import basic_dl.a_quickstart_set.bean.Cat;
import basic_dl.a_quickstart_set.bean.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectSetApplication {
    public static void main(String[] args) {
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("basic_dl/inject-set.xml");
        Person person=beanFactory.getBean(Person.class);
        Cat cat=beanFactory.getBean(Cat.class);
        System.out.println(person);
        System.out.println(cat);
    }
}
