package com.example.unittestdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;

import static org.mockito.Mockito.when;

@SpringBootTest
public class Test3 {

    @SpyBean
    Svc1 svc1;

    @MockBean
    Svc2 svc2;

    @Test
    void t1()
    {
        when(svc2.add(1,1)).thenReturn(3);
        int res = svc1.add(1,1);
        int res2 = svc1.minus(2,1);
        Assertions.assertEquals(3,res);
        Assertions.assertEquals(1,res2);
    }
}
