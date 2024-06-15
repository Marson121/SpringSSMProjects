package edu.ouc;

import edu.ouc.dao.CourseDao;
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
        CourseDao courseDao = (CourseDao) ctx.getBean("courseDao");
        courseDao.save();

    }
}
