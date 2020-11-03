package spring.bean.b_scope.Bean;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)//声明原型类型 原型bean什么时候需要，什么时候创建
public class Toy {
    public Toy() {
        System.out.println("Toy constructor run...");
    }
}
