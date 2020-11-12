package spring.configuration.c_conditional.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import spring.configuration.c_conditional.bean.Bar;
import spring.configuration.c_conditional.config.BarConfiguration;

/**
 * 数组中的元素是 bean的全限定类名
 * BarImportSelector 本身没有注册到容器中
 * @author LF
 * @Date 2020/11/12
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
public class BarImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{Bar.class.getName(), BarConfiguration.class.getName()};
    }
}
