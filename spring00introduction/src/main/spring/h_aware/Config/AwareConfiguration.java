package spring.h_aware.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.h_aware.bean.AwaredTestBean;

@Configuration
public class AwareConfiguration {

    @Bean
    public AwaredTestBean getAware(){
        return new AwaredTestBean();
    }
}
