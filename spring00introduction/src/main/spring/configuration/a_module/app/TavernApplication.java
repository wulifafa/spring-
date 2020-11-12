package spring.configuration.a_module.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ImportSelector;
import spring.configuration.a_module.bean.Bartender;
import spring.configuration.a_module.bean.Boss;
import spring.configuration.a_module.config.TavenConfiguration;

import java.util.Map;
import java.util.stream.Stream;

/**
 * 通过模块装配可以通过一个注解，一次性导入指定场景中需要的组件和配置
 *
 * @author LF
 * @Date 2020/11/12
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
public class TavernApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext atx=new
                AnnotationConfigApplicationContext(TavenConfiguration.class);
        Stream.of(atx.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("-----------");
        Map<String, Bartender> barts=atx.getBeansOfType(Bartender.class);
        barts.forEach((name,bartender)-> System.out.println(bartender));
    }
}
