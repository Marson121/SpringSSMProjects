package edu.ouc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Marson
 * @date 2024/6/16
 */

// 相当于ApplicationContext.xml骨架
@Configuration
// 相当于配置文件中的组建扫描
@ComponentScan("edu.ouc")
public class SpringConfig {
}
