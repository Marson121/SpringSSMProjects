package edu.ouc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Marson
 * @date 2024/6/25
 */

@Configuration
// 方法2：排除controller
// 步骤2：去掉@ComponentScan
@ComponentScan("edu.ouc.controller")
public class SpringMvcConfig {
}
