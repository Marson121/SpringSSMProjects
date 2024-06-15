package edu.ouc;

import edu.ouc.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Marson
 * @date 2024/6/15
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();

        // 在JVM关闭之前关闭容器
        // 方法1
        // ctx.close();
        // 方法2：注册钩子，用于告诉JVM在销毁之前先将容器关闭
        ctx.registerShutdownHook();

    }
}
