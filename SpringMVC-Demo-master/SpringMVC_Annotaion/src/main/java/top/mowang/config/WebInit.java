package top.mowang.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * Spring-MVC-Demo
 * web工程的初始化类，代替web.xml
 *  * @author txssherry@gmail.com
 *     * @date 2023/1/9 15:47
 **/
public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * @description: 指定spring的配置类
     * @author txssherry@gmail.com
     * @date 2023/1/9 15:47
    */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    /**
     * @description: 指定springMVC的配置类
     * @author txssherry@gmail.com
     * @date 2023/1/9 15:47
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    /**
     * @description: 指定dispatcherServlet的映射规则，url-pattern
     * * @author txssherry@gmail.com
     *     * @date 2023/1/9 15:47
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    /**
     * @description: 注册过滤器
     *  * @author txssherry@gmail.com
     *     * @date 2023/1/9 15:47
    */
    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceResponseEncoding(true);
        HiddenHttpMethodFilter hiddenHttpMethodFilter = new HiddenHttpMethodFilter();
        return new Filter[]{characterEncodingFilter,hiddenHttpMethodFilter};
    }
}
