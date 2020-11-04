package spring.lifecycle.a_initmethod.bean;

/**
 * bean生命周期中 是先对属性赋值，后执行init-method方法
 *
 * @author LF
 * @Date 2020/11/4
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
public class Cat {
    private String name;

    public Cat() {
        System.out.println("Cat 构造方法执行了。。。");
    }

    public void setName(String name) {
        System.out.println("Set 方法执行了。。。");
        this.name = name;
    }

    public void init(){
        System.out.println(name+"被初始化了。。。");
    }

    public void destroy(){
        System.out.println(name+"被销毁了。。。");
    }
}
