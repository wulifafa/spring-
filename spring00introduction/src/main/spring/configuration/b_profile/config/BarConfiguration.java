package spring.configuration.b_profile.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.configuration.b_profile.bean.Bar;

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
public class BarConfiguration {

    @Bean
    public Bar bbbar(){
        return new Bar();
    }
}
