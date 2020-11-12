package spring.event.config;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author LF
 * @Date 2020/11/9
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
@Component
public class ContextClosedApplicationListener {

    @EventListener
    public void onContextClosedEvent(ContextClosedEvent event){
        System.out.println("ContextClosedApplicationListener监听到ContextClosedEvent事件！");
    }
}
