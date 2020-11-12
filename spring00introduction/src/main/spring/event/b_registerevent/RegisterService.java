package spring.event.b_registerevent;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;
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
@Service
public class RegisterService implements ApplicationEventPublisherAware {

    ApplicationEventPublisher publisher;

    public void register(String username){
        //用户注册的动作
        System.out.println(username+"注册成功。。。");
        //发布事件
        publisher.publishEvent(new RegisterSuccessEvent(username));
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher=publisher;
    }
}
