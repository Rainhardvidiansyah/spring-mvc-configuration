package com.fundamental.spring.config;

import com.fundamental.spring.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages = "com.fundamental.spring")
public class AppConfig {


    @Bean
    public UserService userService(JdbcTemplate jdbcTemplate){
        return new UserService(jdbcTemplate);
    }

}
