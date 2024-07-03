package com.fundamental.spring.config;


import org.flywaydb.core.Flyway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class FlywayConfig {

    private static final Logger log = LoggerFactory.getLogger(FlywayConfig.class);

    @Value("${db.url}")
    private String url;

    @Value("${db.driverClassName}")
    private String driverClassName;

    @Value("${db.username}")
    private String userName;

    @Value("${db.password}")
    private String password;


    @Bean(initMethod = "migrate")
    public Flyway flyway(DataSource dataSource){
        Flyway flyway = Flyway.configure()
                .dataSource(url, userName, password)
                .locations("classpath:db/migration")
                .driver(driverClassName)
                .load();
        flyway.migrate();
        log.info("Existing when context is loaded -- FlywayConfig.class");
        return flyway;
    }
}
