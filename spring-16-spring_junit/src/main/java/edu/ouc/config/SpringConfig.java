package edu.ouc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Marson
 * @date 2024/6/17
 */

@Configuration
@ComponentScan("edu.ouc")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
public class SpringConfig {
    // spring管理的bean
    // 1.DataSource
    // 2.SqlSessionFactoryBean
    // 3.MapperScannerConfigurer
    // 4.AccountService
}
