package edu.ouc.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

/**
 * @author Marson
 * @date 2024/6/16
 */

// 相当于ApplicationContext.xml骨架
@Configuration
// 相当于配置文件中的组建扫描
@ComponentScan("edu.ouc")
// 扫描属性配置
@PropertySource("jdbc.properties")
// 导入其他配置类
@Import(JdbcConfig.class)
public class SpringConfig {
}
