package spring.lifecycle.c_initializingbean.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author LF
 * @Date 2020/11/4
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
public class InitializingDisposableAnnoApplication {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext acx=new AnnotationConfigApplicationContext("spring.lifecycle.c_initializingbean.bean");
        System.out.println("IOC容器初始化完成。。。");
        System.out.println();
        System.out.println("准备销毁IOC容器。。。");
        acx.close();
        System.out.println("IOC容器销毁完成。。。");
    }
}
