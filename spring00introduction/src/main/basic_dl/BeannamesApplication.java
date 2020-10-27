package basic_dl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.stream.Stream;

/**
 * 获取ioc容器中的所有bean
 * @author LF
 * @Date 2020/10/27
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
public class BeannamesApplication {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("basic_dl/quickstart-withanno.xml");
        String[] beannames=ctx.getBeanDefinitionNames();
        //jdk8 stream 快速编写打印方法
        Stream.of(beannames).forEach(System.out::println);
    }
}
