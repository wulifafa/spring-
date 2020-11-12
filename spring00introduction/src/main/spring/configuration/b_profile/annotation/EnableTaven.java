package spring.configuration.b_profile.annotation;

import org.springframework.context.annotation.Import;
import spring.configuration.b_profile.bean.Boss;
import spring.configuration.b_profile.config.BartenderConfiguration;
import spring.configuration.b_profile.selector.BarImportSelector;
import spring.configuration.b_profile.selector.WaiterRegister;

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
@Import({Boss.class, BartenderConfiguration.class, BarImportSelector.class, WaiterRegister.class})
public @interface EnableTaven {
}
