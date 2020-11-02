package spring.bean.a_type.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.annotation.app.AnnotationConfigApplication;
import spring.bean.a_type.Bean.Toy;
import spring.bean.a_type.config.ToyConfig;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author LF
 * @Date 2020/11/2
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
public class ToyFactoryBeanApplication {

    public static void main(String[] args) {
        ApplicationContext ctx= new AnnotationConfigApplicationContext(ToyConfig.class);
        Toy toy=ctx.getBean(Toy.class);
        System.out.println(toy);
    }
}
