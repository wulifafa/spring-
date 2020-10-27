package spring.property.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author LF
 * @Date 2020/10/27
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
@Component
public class Red {

    @Value("${red.name}")
    private String name;

    @Value("${red.order}")
    private Integer order;

    @Override
    public String toString() {
        return "Red{" +
                "name='" + name + '\'' +
                ", order=" + order +
                '}';
    }
}
