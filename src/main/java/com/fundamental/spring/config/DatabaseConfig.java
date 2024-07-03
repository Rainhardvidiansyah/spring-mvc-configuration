package com.fundamental.spring.config;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:application.properties")
@Slf4j
public class DatabaseConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Value("${db.url}")
    private String url;

    @Value("${db.driverClassName}")
    private String driverClassName;

    @Value("${db.username}")
    private String userName;

    @Value("${db.password}")
    private String password;



    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource managerDataSource = new DriverManagerDataSource();
        managerDataSource.setUrl(url);
        managerDataSource.setDriverClassName(driverClassName);
        managerDataSource.setUsername(userName);
        managerDataSource.setPassword(password);

        log.info("DataSource Bean initialized");
        return managerDataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        log.info("JDBCTemplate initialized");

        return new JdbcTemplate(dataSource);
    }


}
