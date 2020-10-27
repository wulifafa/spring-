package spring.h_aware.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.h_aware.Config.AwareConfiguration;
import spring.h_aware.bean.AwaredTestBean;


public class AwareApplication {

    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(AwareConfiguration.class);
        ctx.getBean(AwaredTestBean.class).printBeanName();
    }
}
