package com.example.unittestdemo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Test2 {

    @BeforeAll
    static void init(){
        System.out.println("init once");
    }

    // 每次在@Test测试之前运行一次 @AfterEach，@BeforeAll等类似同理
    @BeforeEach
    void each() {
        System.out.println("init");
    }

    @Test
    public void t1(){
        System.out.println(123);
    }

    @Test
    public void t2(){
        System.out.println(456);
    }


}
