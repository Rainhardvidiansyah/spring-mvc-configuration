package com.fundamental.spring;


import com.fundamental.spring.config.AppConfig;
import com.fundamental.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main( String[] args ) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);
        System.out.println(userService.printString());


    }
}
/*
Context to call bean:
[
AnnotationConfigWebApplicationContext,
AnnotationConfigApplicationContext
]
*/
