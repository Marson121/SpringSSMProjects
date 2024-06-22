package edu.ouc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * @author Marson
 * @date 2024/6/15
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        DataSource dataSource = (DataSource) ctx.getBean("dataSource");

        System.out.println(dataSource);

        // DataSource c3p0 = (DataSource) ctx.getBean("c3p0");
        //
        // System.out.println(c3p0);


    }
}
