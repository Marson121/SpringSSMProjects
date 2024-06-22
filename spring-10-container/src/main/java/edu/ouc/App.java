package edu.ouc;

import edu.ouc.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author Marson
 * @date 2024/6/16
 */
public class App {
    public static void main(String[] args) {
        // 容器创建方式1：类路径下的XML配置文件：从当前项目的路径下查找
        // ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        // 容器创建方式2：文件系统下的XML配置文件：从磁盘开始查找
        ApplicationContext ctx = new FileSystemXmlApplicationContext("D:\\Develop\\JavaProjects\\SpringSSMProjects\\spring-10-container\\src\\main\\resources\\ApplicationContext.xml");

        // bean的获取方式1：按照id
        // BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        // bean的获取方式2：指定类型
        // BookDao bookDao = ctx.getBean("bookDao", BookDao.class);
        // bean的获取方式3：按照类型
        BookDao bookDao = ctx.getBean(BookDao.class);
        bookDao.save();
    }
}
