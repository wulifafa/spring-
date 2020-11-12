package spring.event.b_registerevent;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import spring.event.b_registerevent.RegisterSuccessEvent;

/**
 * 注解式监听器的触发时机比接口监听器早
 *
 * @author LF
 * @Date 2020/11/12
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
@Component
public class EmailSenderListener {

    @EventListener
    public void onRegisterSuccess(RegisterSuccessEvent event){
        System.out.println("监听到用户注册成功！发送邮件中。。。");
    }
}
