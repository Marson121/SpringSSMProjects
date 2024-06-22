package edu.ouc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
/**
 * @author Marson
 * @date 2024/6/22
 */
@Configuration
@ComponentScan("edu.ouc")
@EnableAspectJAutoProxy
public class SpringConfig {

    // spring管理的bean
    // 1.MyAdvice
    // 2.BookDaoImpl
}
