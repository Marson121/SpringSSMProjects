package edu.ouc.config;

import com.alibaba.druid.pool.DruidDataSource;
import edu.ouc.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @author Marson
 * @date 2024/6/16
 */
public class JdbcConfig {

    // 写配置文件时也是在配置文件中添加第三方bean
    // 使用注解时通过@Bean表示当前方法返回值作为spring管理的bean

    // 第三方bean中注入引用数据类型和基本数据类型：

    // 方法1：使用${}注入基本数据类型，引用数据类型作为形参，spring会根据类型自动装配
    // @Bean
    // public DataSource dataSource(BookDao bookDao){
    //     System.out.println(bookDao);
    //     DruidDataSource ds = new DruidDataSource();
    //     ds.setDriverClassName("${jdbc.Driver}");;
    //     ds.setUrl("${jdbc.url}");
    //     ds.setUsername("${jdbc.username}");
    //     ds.setPassword("${jdbc.password}");
    //     return ds;
    // }

    // 方法2：使用成员变量注入基本数据类型，引用数据类型作为形参，spring会根据类型自动装配
    @Value("${jdbc.Driver}")
    private String Driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean
    public DataSource dataSource(BookDao bookDao){
        System.out.println(bookDao);
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(Driver);;
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }

}
