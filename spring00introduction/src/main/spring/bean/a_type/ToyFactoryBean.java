package spring.bean.a_type;

import org.springframework.beans.factory.FactoryBean;
import spring.bean.a_type.Bean.Ball;
import spring.bean.a_type.Bean.Car;
import spring.bean.a_type.Bean.Child;
import spring.bean.a_type.Bean.Toy;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author LF
 * @Date 2020/11/2
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
public class ToyFactoryBean implements FactoryBean<Toy> {

    private Child child;

    @Override
    public Toy getObject() throws Exception {
        switch (child.getWantToy()){
            case "ball":
                return new Ball("ball");
            case "car":
                return new Car("car");
            default:
                return null;
        }
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}
