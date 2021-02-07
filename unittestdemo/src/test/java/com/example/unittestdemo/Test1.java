package com.example.unittestdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test1 {
    @Test
    void fun1() {
        int res = 1+1;
        Assertions.assertEquals(3, res);
    }
}
