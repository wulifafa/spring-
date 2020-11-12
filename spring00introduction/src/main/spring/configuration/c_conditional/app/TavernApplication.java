package spring.configuration.c_conditional.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.configuration.c_conditional.config.TavenConfiguration;

import java.util.stream.Stream;

/**
 *
 *
 * @author LF
 * @Date 2020/11/12
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
public class TavernApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext atx=new
                AnnotationConfigApplicationContext();
        atx.getEnvironment().setActiveProfiles("city");
        atx.register(TavenConfiguration.class);
        atx.refresh();
        Stream.of(atx.getBeanDefinitionNames()).forEach(System.out::println);

    }
}
