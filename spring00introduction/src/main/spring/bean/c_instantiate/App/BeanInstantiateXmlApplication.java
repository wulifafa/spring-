package spring.bean.c_instantiate.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.bean.c_instantiate.Bean.Car;
import spring.bean.c_instantiate.Bean.CarStaticFactory;


public class BeanInstantiateXmlApplication {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("Bean/bean-instantiate.xml");
        ctx.getBeansOfType(Car.class).forEach((beanName, car)->
            System.out.println(beanName+":"+car));

        //静态工厂本身不会被注册到ioc容器中
        //System.out.println(ctx.getBean(CarStaticFactory.class));
    }
}
