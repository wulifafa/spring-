package spring.configuration.c_conditional.annotation;

import org.springframework.context.annotation.Import;
import spring.configuration.c_conditional.bean.Boss;
import spring.configuration.c_conditional.config.BartenderConfiguration;
import spring.configuration.c_conditional.selector.BarImportSelector;
import spring.configuration.c_conditional.selector.WaiterRegister;

import java.lang.annotation.*;

/**
 * 模块装配的四种方式
 *  普通类，配置类，实现importSelector接口类，实现ImportBeanDefinitionRegistrar接口
 * @author LF
 * @Date 2020/11/12
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({BartenderConfiguration.class, BarImportSelector.class, WaiterRegister.class})
public @interface EnableTaven {
}
