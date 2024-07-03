package com.fundamental.spring.service;


import com.fundamental.spring.user.Users;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.concurrent.atomic.AtomicLong;

public class UserService {


    private JdbcTemplate jdbcTemlate;

    public UserService(JdbcTemplate jdbcTemlate) {
        this.jdbcTemlate = jdbcTemlate;
    }

    public Users greetingName(Users users){
        users.setId(atomicLong());
        return users;
    }

    private Long atomicLong(){
        AtomicLong atomic = new AtomicLong();
        return atomic.incrementAndGet();
    }

    public String printString(){
        return "This string is from Bean";
    }
}
