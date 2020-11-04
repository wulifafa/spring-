package spring.lifecycle.b_jsr250.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @PostConstruct 对应init-method
 * @PreDestory 对应destory method
 *
 * @author LF
 * @Date 2020/11/4
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
@Component
public class Pen {

    public Integer ink;

    @PostConstruct
    public void addInk(){
        System.out.println("笔加墨。。。");
        this.ink=100;
    }

    @PreDestroy
    public void outwellInk(){
        System.out.println("墨放干。。。");
        this.ink=0;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "ink=" + ink +
                '}';
    }
}
