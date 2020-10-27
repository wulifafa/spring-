package spring.d_complexfield.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.d_complexfield.bean.Bird;
import spring.d_complexfield.bean.Dog;
import spring.d_complexfield.config.ComplexFieldConfiguration;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author LF
 * @Date 2020/10/27
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
public class InjectComplexFieldAnnoApplication {
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(ComplexFieldConfiguration.class);
        Dog dog=ctx.getBean(Dog.class);
        Bird bird=ctx.getBean(Bird.class);
        System.out.println(bird);
        System.out.println(dog);

    }
}
