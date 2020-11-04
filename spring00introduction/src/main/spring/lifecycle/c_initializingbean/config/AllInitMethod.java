package spring.lifecycle.c_initializingbean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.lifecycle.c_initializingbean.bean.AllPen;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author LF
 * @Date 2020/11/4
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
@Configuration
public class AllInitMethod {

    @Bean(initMethod = "open",destroyMethod = "close")
    public AllPen pen(){
        return new AllPen();
    }
}
