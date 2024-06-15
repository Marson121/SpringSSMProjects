package edu.ouc;

import edu.ouc.service.BookService;
import edu.ouc.service.Impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Marson
 * @date 2024/6/15
 */
public class App {
    public static void main(String[] args) {
        // BookServiceImpl bookService = new BookServiceImpl();
        // bookService.save();

        // 1.创建IOC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        // 2.获取bean
        BookService bookService = (BookService) ctx.getBean("bookService");

        bookService.save();
    }
}
