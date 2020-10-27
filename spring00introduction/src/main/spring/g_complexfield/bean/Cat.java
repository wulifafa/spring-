package spring.g_complexfield.bean;

import org.springframework.stereotype.Component;

public class Cat {

    private String  name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
