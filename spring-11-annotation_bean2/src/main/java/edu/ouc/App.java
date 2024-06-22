package edu.ouc;

import edu.ouc.config.SpringConfig;
import edu.ouc.dao.BookDao;
import edu.ouc.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Marson
 * @date 2024/6/16
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
        bookDao.save();

        BookService bookService = ctx.getBean(BookService.class);
        bookService.save();
    }
}
