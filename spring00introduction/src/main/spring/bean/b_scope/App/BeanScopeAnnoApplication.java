package spring.bean.b_scope.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.bean.b_scope.Bean.Child;
import spring.bean.b_scope.Config.BeanScopeConfiguration;

public class BeanScopeAnnoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(BeanScopeConfiguration.class);
        ctx.getBeansOfType(Child.class).forEach((name,child)->{
            System.out.println(name+":"+child);
        });
    }
}
