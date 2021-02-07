package com.example.unittestdemo;

import org.springframework.beans.factory.annotation.Autowired;

public class Svc1 {

    @Autowired
    Svc2 svc2;

    public int add(int a, int b) {
        return svc2.add(a,b);
    }

    public int minus(int a, int b) {
        return a-b;
    }
}
