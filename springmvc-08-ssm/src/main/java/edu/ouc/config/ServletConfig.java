package edu.ouc.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * @author Marson
 * @date 2024/7/1
 */
public class ServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}


// public class ServletConfig extends AbstractDispatcherServletInitializer {
//     @Override
//     protected WebApplicationContext createServletApplicationContext() {
//         AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//         ctx.register(SpringMvcConfig.class);
//         return ctx;
//     }
//
//     @Override
//     protected String[] getServletMappings() {
//         return new String[]{"/"};
//     }
//
//     @Override
//     protected WebApplicationContext createRootApplicationContext() {
//         AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//         ctx.register(SpringMvcConfig.class);
//         return ctx;
//     }
// }
