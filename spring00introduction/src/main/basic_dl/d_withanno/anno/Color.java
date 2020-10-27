package basic_dl.d_withanno.anno;

import java.lang.annotation.*;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author LF
 * @Date 2020/10/27
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （必须）
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Color {
}
