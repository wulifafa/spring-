package spring.d_complexfield.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * 在 Bean 中直接在 属性 / setter 方法 上标注 @Autowired 注解，
 * IOC 容器会按照属性对应的类型，从容器中找对应类型的 Bean 赋值到对应的属性上，实现自动注入。
 *
 * 给dog注入Person的三种方式
 * 1.@Autowired 2.构造器注入方式 3.setter注入
 * @author LF
 * @Date 2020/10/27
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
@Component
public class Dog {

    @Value("dogdog")
    private String name;

    @Autowired
   // @Qualifier("administrator") //多个相同类型的bean自动注入 用@Qualifier 指定bean
    private List<Person> person; //注入多个对象直接用集合接收

    //2.构造器注入方式
//    public Dog(Person person){
//        this.person=person;
//    }

    //setter 方式注入
//    public void setPerson(Person person) {
//        this.person = person;
//    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", person=" + person +
                '}';
    }
}
