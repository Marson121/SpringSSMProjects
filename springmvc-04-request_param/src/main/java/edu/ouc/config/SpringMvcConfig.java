package edu.ouc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Marson
 * @date 2024/6/25
 */
@Configuration
@ComponentScan("edu.ouc.controller")
@EnableWebMvc
public class SpringMvcConfig {
}
