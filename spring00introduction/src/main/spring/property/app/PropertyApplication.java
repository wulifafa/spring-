package spring.property.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.property.bean.Red;
import spring.property.config.InjectValueConfiguration;

import java.util.Map;
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
public class PropertyApplication {


    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(InjectValueConfiguration.class);
        String[] beans=ctx.getBeanDefinitionNames();

        Stream.of(beans).forEach(System.out::println);

        Red red=ctx.getBean(Red.class);
        System.out.println(red.toString());
    }
}
