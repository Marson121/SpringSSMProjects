package edu.ouc;

import edu.ouc.config.SpringConfig;
import edu.ouc.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Marson
 * @date 2024/6/22
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
        String name = bookDao.findName(1, "marson");
        // System.out.println(name);
    }
}
