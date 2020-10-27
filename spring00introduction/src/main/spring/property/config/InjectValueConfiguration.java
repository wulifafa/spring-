package spring.property.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author LF
 * @Date 2020/10/27
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
@Configuration
@ComponentScan("spring.property.bean")
@PropertySource("classpath:basic_dl/value/red.properties")
public class InjectValueConfiguration {
}
