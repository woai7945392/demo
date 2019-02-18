package com.demo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * 配置数据源
 *
 * @Author: DYG
 * @Description:
 * @Date: Created in 11:31 2019/2/18
 * @Modified By: DYG
 * @Date Modified in: 11:31 2019/2/18
 */
@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        return dataSourceBuilder.driverClassName("com.mysql.jdbc.Driver")
                .url("jdbc:mysql://10.9.5.36:3306/kasly")
                .username("kasly")
                .password("N15ZQab2Rb4DcXlo")
                .type(com.alibaba.druid.pool.DruidDataSource.class)
                .build();

    }
}
