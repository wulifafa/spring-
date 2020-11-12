package spring.event.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.event.b_registerevent.RegisterService;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author LF
 * @Date 2020/11/12
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
public class RegisterEventApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext atx=new
                AnnotationConfigApplicationContext("spring.event.b_registerevent");
        RegisterService registerService=atx.getBean(RegisterService.class);
        registerService.register("lf");
    }
}
