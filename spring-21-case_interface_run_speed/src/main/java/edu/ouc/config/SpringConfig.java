package edu.ouc.config;

import org.springframework.context.annotation.*;

/**
 * @author Marson
 * @date 2024/6/21
 */
@Configuration
@ComponentScan("edu.ouc")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {
    // spring管理的bean
    // 1.DataSource
    // 2.SqlSessionFactoryBean
    // 3.MapperScannerConfigurer
    // 4.AccountServiceImpl
    // 5.ServiceAdvice
}
