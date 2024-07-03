package com.fundamental.spring;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestMockito {

    @Test
    void printEverything(){
        System.out.println("I am testing my software!!!");
    }
}
