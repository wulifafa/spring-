package spring.bean.b_scope.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.bean.b_scope.Bean.Child;
import spring.bean.b_scope.Bean.Toy;

@Configuration
@ComponentScan("spring.bean.b_scope.Bean")
public class BeanScopeConfiguration {

    //bean作用域默认是单实例的 使用原型bean生成的bean是不同的
    @Bean
    public Child child1(Toy toy) {
        Child child = new Child();
        child.setToy(toy);
        return child;
    }

    @Bean
    public Child child2(Toy toy) {
        Child child = new Child();
        child.setToy(toy);
        return child;
    }


}
