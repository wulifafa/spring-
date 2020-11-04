package spring.lifecycle.c_initializingbean.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.lifecycle.c_initializingbean.config.AllInitMethod;

/**
 * Bean三种生命周期控制方式
 * xml配置，@bean配置 init-method,destroy-method
 * @PostConstruct @PreDestroy
 * 实现InitializingBean, DisposableBean接口
 *
 * @author LF
 * @Date 2020/11/4
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
public class AllInitMethodApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext atx=new AnnotationConfigApplicationContext(AllInitMethod.class);
        atx.close();
    }
}
