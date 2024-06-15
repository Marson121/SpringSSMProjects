package edu.ouc;

import edu.ouc.service.BookService;
import edu.ouc.service.Impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.transform.Source;

/**
 * @author Marson
 * @date 2024/6/15
 */
public class App {
    public static void main(String[] args) {
        // 1.创建IOC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        // 2.获取bean
        BookService bookService = (BookService) ctx.getBean("bookService");
        // BookService bookService = (BookService) ctx.getBean("service");     // 根据名称获取备案
        BookService bookService2 = (BookService) ctx.getBean("bookService");

        // bookService.save();
        System.out.println(bookService);
        System.out.println(bookService2);

    }
}
