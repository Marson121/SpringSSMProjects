package edu.ouc.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @author Marson
 * @date 2024/6/17
 */
public class MybatisConfig {

    /**
     * 获取SqlSessionFactoryBean对象
     * @param dataSource
     * @return
     */
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        // 设置别名扫描的包路径
        sqlSessionFactoryBean.setTypeAliasesPackage("edu.ouc.pojo");
        // 设置数据源，数据源通过形参由spring按照类型注入
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }

    /**
     * 设置mapper映射
     * @return
     */
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("edu.ouc.dao");
        return mapperScannerConfigurer;
    }
}
