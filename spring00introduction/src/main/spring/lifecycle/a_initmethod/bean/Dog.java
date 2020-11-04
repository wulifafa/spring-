package spring.lifecycle.a_initmethod.bean;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author LF
 * @Date 2020/11/4
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
public class Dog {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void init(){
        System.out.println(name+"被初始化了。。。");
    }

    public void destroy(){
        System.out.println(name+"被销毁了。。。");
    }
}
