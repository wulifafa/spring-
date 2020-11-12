package spring.event.app;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author LF
 * @Date 2020/11/9
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
public class QuickstartListenerApplication {


    public static void main(String[] args) {
        System.out.println("准备初始化IOC容器。。。");
        AnnotationConfigApplicationContext ctx=
                new AnnotationConfigApplicationContext("spring.event.config");
        System.out.println("IOC容器初始化完成。。。");
        ctx.close();
        System.out.println("IOC容器关闭");
    }

}
