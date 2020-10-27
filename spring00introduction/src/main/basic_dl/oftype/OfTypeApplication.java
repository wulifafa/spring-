package basic_dl.oftype;

import basic_dl.oftype.dao.DemoDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author LF
 * @Date 2020/10/27
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
public class OfTypeApplication {

    public static void main(String[] args)  {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl/quickstart-oftype.xml");
        Map<String, DemoDao> beans = ctx.getBeansOfType(DemoDao.class);
        beans.forEach((beanName, bean) -> System.out.println(beanName + " : " + bean.toString()));
    }
}
