package spring.lifecycle.a_initmethod.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.lifecycle.a_initmethod.config.InitMethodConfig;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author LF
 * @Date 2020/11/4
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
public class InitMethodXmlApplication {

    public static void main(String[] args) {
        System.out.println("准备初始化IOC容器。。。");
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("lifecycle/initmethod.xml");
        System.out.println("IOC容器初始化完成。。。");

        System.out.println();

        System.out.println("准备销毁IOC容器。。。");
        ctx.close();
        System.out.println("IOC容器销毁完成。。。");


        AnnotationConfigApplicationContext ctx1=new AnnotationConfigApplicationContext(InitMethodConfig.class);
        ctx1.close();
    }
}
