package spring.lifecycle.c_initializingbean.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author LF
 * @Date 2020/11/4
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
@Component
public class Pen implements InitializingBean, DisposableBean {

    private Integer ink;

    @Override
    public void destroy() throws Exception {
        System.out.println("钢笔中已加满墨水");
        this.ink=100;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("钢笔中墨水放干净了");
        this.ink=0;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "ink=" + ink +
                '}';
    }
}
