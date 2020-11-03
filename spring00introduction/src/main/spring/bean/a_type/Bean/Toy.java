package spring.bean.a_type.Bean;

import org.springframework.context.annotation.Bean;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author LF
 * @Date 2020/11/2
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
public abstract class Toy {
    private String name;

    public Toy(String name){
        System.out.println("生产了一个"+name);
        this.name=name;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                '}';
    }
}
