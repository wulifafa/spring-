package spring.configuration.c_conditional.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

/**
 * @Profile作用 切换数据源
 * 通过声明@Profile 再通过@PropertySource注解+外部配置文件，
 * 可以做到只切换profile即可切换不同数据源
 *
 * @author LF
 * @Date 2020/11/12
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
@Configuration
public class DataSourceConfiguration {

    @Bean
    @Profile("dev")
    public DataSource devDataSource(){
        return null;
    }

    @Bean
    @Profile("test")
    public DataSource testDataSource(){
        return null;
    }

    @Bean
    @Profile("prod")
    public DataSource prodDataSource(){
        return null;
    }

}
