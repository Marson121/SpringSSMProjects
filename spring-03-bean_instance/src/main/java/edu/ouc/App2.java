package edu.ouc;

import edu.ouc.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Marson
 * @date 2024/6/15
 */
public class App2 {
    public static void main(String[] args) {
        // 1.创建IOC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        // 2.获取bean
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
    }
}
