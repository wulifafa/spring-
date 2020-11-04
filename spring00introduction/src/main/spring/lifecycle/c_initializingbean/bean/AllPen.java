package spring.lifecycle.c_initializingbean.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author LF
 * @Date 2020/11/4
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
public class AllPen implements InitializingBean, DisposableBean {

    private Integer ink;

    public void open() {
        System.out.println("init-method - 打开钢笔。。。");
    }

    public void close() {
        System.out.println("destroy-method - 合上钢笔。。。");
    }

    @PostConstruct
    public void addInk() {
        System.out.println("@PostConstruct - 钢笔中已加满墨水。。。");
        this.ink = 100;
    }

    @PreDestroy
    public void outwellInk() {
        System.out.println("@PreDestroy - 钢笔中的墨水都放干净了。。。");
        this.ink = 0;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean - 准备写字。。。");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean - 写完字了。。。");
    }

    @Override
    public String toString() {
        return "AllPen{" +
                "ink=" + ink +
                '}';
    }
}
