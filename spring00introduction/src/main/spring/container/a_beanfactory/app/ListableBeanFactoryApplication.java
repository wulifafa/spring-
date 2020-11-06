package spring.container.a_beanfactory.app;

import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.DefaultSingletonBeanRegistry;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.io.ClassPathResource;
import spring.container.a_beanfactory.bean.Dog;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 *  ListableBeanFactroy获取容器内所有bean时不会真的把这些手动注册的拿出来
 * @author LF
 * @Date 2020/11/5
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
public class ListableBeanFactoryApplication {


    public static void main(String[] args) {
        ClassPathResource resource=new ClassPathResource("container/listable-container.xml");
        DefaultListableBeanFactory beanFactory=new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader=new XmlBeanDefinitionReader(beanFactory);
        beanDefinitionReader.loadBeanDefinitions(resource);

        //打印容器中的所有bean
        System.out.println("加载xml文件后容器中的bean:");
        Stream.of(beanFactory.getBeanDefinitionNames()).forEach(System.out::println);

        //手动注册一个单实例bean
        beanFactory.registerSingleton("doggg",new Dog());

        Stream.of(beanFactory.getBeanDefinitionNames()).forEach(System.out::println);

        System.out.println("容器中真的有注册Dog：" + beanFactory.getBean("doggg"));
        // 通过getBeanNamesOfType查找Dog
        System.out.println("容器中的所有Dog：" + Arrays.toString(beanFactory.getBeanNamesForType(Dog.class)));
    }
}
