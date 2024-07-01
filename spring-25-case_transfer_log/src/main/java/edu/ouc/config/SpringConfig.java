package edu.ouc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Marson
 * @date 2024/6/24
 */
@Configuration
@ComponentScan("edu.ouc")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
@EnableTransactionManagement
public class SpringConfig {

    // spring管理的bean
    // 1.DataSource
    // 2.PlatformTransactionManager
    // 3.SqlSessionFactoryBean
    // 4.MapperScannerConfigurer
    // 5.AccountService
    // 6.AccountDao
    // 7.LogService
    // 8.LogDao
}
