package spring.configuration.c_conditional.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.type.AnnotatedTypeMetadata;
import spring.configuration.c_conditional.annotation.ConditionalOnBean;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author LF
 * @Date 2020/11/12
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
public class OnBeanCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        String[] beanNames=(String[]) metadata.getAnnotationAttributes(ConditionalOnBean.class.getName()).get("beanNames");
        for (String beanName: beanNames) {
            if (!context.getBeanFactory().containsBeanDefinition(beanName)){
                return true;
            }
        }
        return false;
    }
}
