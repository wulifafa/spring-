package spring.bean.c_instantiate.Bean;

import spring.bean.c_instantiate.Bean.Car;

public class CarStaticFactory {

    public static Car getCar(){
        return new Car();
    }
}
