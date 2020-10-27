package basic_dl.d_withanno;

import basic_dl.d_withanno.anno.Color;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * getBeanwithAnnotation 传入一个注解的class返回被这个注解标注的bean
 *
 * @author LF
 * @Date 2020/10/27
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
public class WithAnnoApplication {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("basic_dl/quickstart-withanno.xml");
        Map<String,Object> map=ctx.getBeansWithAnnotation(Color.class);
        map.forEach((beanname,bean)-> System.out.println(beanname+":"+bean.toString()));
    }
}
