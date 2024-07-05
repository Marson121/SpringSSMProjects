package edu.ouc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Marson
 * @date 2024/7/1
 */
@Configuration
@ComponentScan({"edu.ouc.controller", "edu.ouc.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
