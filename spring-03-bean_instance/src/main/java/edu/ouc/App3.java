package edu.ouc;

import edu.ouc.dao.BookDao;
import edu.ouc.dao.OrderDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Marson
 * @date 2024/6/15
 */
public class App3 {
    public static void main(String[] args) {
        // 1.创建IOC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        // 2.获取bean
        OrderDao orderDao = (OrderDao) ctx.getBean("orderDao");
        orderDao.save();
    }
}
