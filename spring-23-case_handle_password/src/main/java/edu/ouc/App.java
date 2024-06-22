package edu.ouc;

import edu.ouc.config.SpringConfig;
import edu.ouc.service.Impl.ResourceServiceImpl;
import edu.ouc.service.ResourceService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Marson
 * @date 2024/6/22
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        ResourceService resourceService = ctx.getBean(ResourceService.class);
        boolean flag = resourceService.openUrl("https://www.baidu.com", "123456 ");
        System.out.println(flag);
    }
}
