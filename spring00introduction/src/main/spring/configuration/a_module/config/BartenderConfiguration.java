package spring.configuration.a_module.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.configuration.a_module.bean.Bartender;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author LF
 * @Date 2020/11/12
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
@Configuration
public class BartenderConfiguration {

    @Bean
    public Bartender lf(){
        return new Bartender("lf");
    }

    @Bean
    public Bartender zhangsan(){
        return new Bartender("zhangsan");
    }
}
