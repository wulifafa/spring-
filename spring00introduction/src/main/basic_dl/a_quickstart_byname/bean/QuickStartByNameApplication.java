package basic_dl.a_quickstart_byname.bean;

import com.lf.dao.DemoDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuickStartByNameApplication {
    public static void main(String[] args) {
        BeanFactory factory=new ClassPathXmlApplicationContext("basic_dl/quickstart-bybyte.xml");
        //Person person=(Person) factory.getBean("person");
        Person person=factory.getBean(Person.class);
        DemoDao demoDao=factory.getBean(DemoDao.class);
        System.out.println(demoDao.findAll());
    }
}
