package edu.ouc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;


/**
 * @author Marson
 * @date 2024/6/25
 */

@Configuration
// 方法1：精确扫描
@ComponentScan({"edu.ouc.service", "edu.ouc.dao"})
// 方法2：排除controller
// 步骤1：定义规则
// @ComponentScan(value = "edu.ouc",
//     excludeFilters = @ComponentScan.Filter(
//             type = FilterType.ANNOTATION,
//             classes = Controller.class
//     )
// )
public class SpringConfig {
}
