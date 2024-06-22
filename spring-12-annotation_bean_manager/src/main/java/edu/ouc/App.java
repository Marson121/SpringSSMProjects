package edu.ouc;

import edu.ouc.config.SpringConfig;
import edu.ouc.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Marson
 * @date 2024/6/16
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        // 这里注意：使用非单例时注册钩子和close()都不能成功打印destroy
        ctx.registerShutdownHook();

        BookDao bookDao1 = ctx.getBean(BookDao.class);
        System.out.println(bookDao1);

        BookDao bookDao2 = ctx.getBean(BookDao.class);
        System.out.println(bookDao2);

        // ctx.close();
    }
}
