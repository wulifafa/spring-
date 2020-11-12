package spring.configuration.b_profile.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.configuration.b_profile.bean.Bartender;
import spring.configuration.b_profile.config.TavenConfiguration;

import java.util.Map;
import java.util.stream.Stream;

/**
 *  条件装配 根据不同环境动态配置组件和配置
 *
 *  bean的初始化在new annotationconfigApplicationContext就已经完成
 *  所以setActiveProfiles得在初始化前
 *  或者声明设置运行时环境
 *  -Dspring.profiles.active=xxx
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
