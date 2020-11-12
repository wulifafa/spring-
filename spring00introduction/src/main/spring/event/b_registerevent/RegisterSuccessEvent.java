package spring.event.b_registerevent;

import org.springframework.context.ApplicationEvent;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author LF
 * @Date 2020/11/12
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */

/**
 * 自定义用户注册成功事件
 * 自定义事件的继承方式是通过继承ApplicationEvent
 */
public class RegisterSuccessEvent  extends ApplicationEvent {


    public RegisterSuccessEvent(Object source) {
        super(source);
    }


}
