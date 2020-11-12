package spring.configuration.b_profile.selector;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import spring.configuration.b_profile.bean.Waiter;

/**
 *  registerBeanDefinition方法第一个参数是bean id，第二个是bean的class对象
 * @author LF
 * @Date 2020/11/12
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
public class WaiterRegister implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry){
        registry.registerBeanDefinition("waiter",new RootBeanDefinition(Waiter.class));
    }
}
