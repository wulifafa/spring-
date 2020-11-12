package spring.configuration.c_conditional.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import spring.configuration.c_conditional.annotation.ConditionalOnBean;
import spring.configuration.c_conditional.bean.Bar;
import spring.configuration.c_conditional.condition.ExistBossCondition;

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
    @ConditionalOnBean(beanNames = "spring.configuration.c_conditional.bean.Boss")
    public Bar bbbar(){
        return new Bar();
    }
}
