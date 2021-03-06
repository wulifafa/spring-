package spring.event.b_registerevent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import spring.event.b_registerevent.RegisterSuccessEvent;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author LF
 * @Date 2020/11/12
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
@Component
public class SmsSenderListener implements ApplicationListener<RegisterSuccessEvent> {

    @Override
    public void onApplicationEvent(RegisterSuccessEvent registerSuccessEvent) {
        System.out.println("监听到用户注册成功，发送短信");
    }
}
