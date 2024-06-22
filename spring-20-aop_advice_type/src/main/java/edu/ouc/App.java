package edu.ouc;

import edu.ouc.config.SpringConfig;
import edu.ouc.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Marson
 * @date 2024/6/20
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
        bookDao.update();
        // int ret = bookDao.select();
        // System.out.println(ret);
    }
}
