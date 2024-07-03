package com.fundamental.spring.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user/auth")
public class RegistrationController {

    private static final Logger log = LoggerFactory.getLogger(RegistrationController.class);


    @GetMapping("/")
    public ResponseEntity<?> getString(){
        log.info("Request received in registration controller class");
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }


}
