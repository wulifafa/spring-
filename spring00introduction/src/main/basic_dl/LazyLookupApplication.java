package basic_dl;

import basic_dl.d_withanno.bean.Dog;
import basic_dl.d_withanno.bean.Red;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *   xml中没注册的bean 调用getbean时会报错
 *   改良-延迟查找 用objectProvider实现延迟查找 只有getobject的时候才会报错
 * @author LF
 * @Date 2020/10/27
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
public class LazyLookupApplication {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("basic_dl/ImmediatlyLookupApplication");
        Red red=ctx.getBean(Red.class);
        System.out.println(red);
        //
        ObjectProvider<Dog> dogs=ctx.getBeanProvider(Dog.class);

        Dog dog=dogs.getIfAvailable(Dog::new);

        //一般情况下，取出的Bean 会马上或间歇的用到，ObjectProvider
        // 提供了一个ifavailable方法 可以在bean存在时执行Consumer接口方法
        dogs.ifAvailable(dog1 -> System.out.println(dog));
    }
}
