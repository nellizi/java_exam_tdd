package com.ll.exam;


import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {
    @Test
    public void 더하기테스트(){
        int rs = Calculator.add("10+20");
        assertEquals(30,rs);
    }
    @Test
    public void 더하기테스트_2(){
        int rs = Calculator.add("20+20");
        assertEquals(40,rs);
    }
    @Test
    public void 더하기케이스_3(){
        int rs = Calculator.add("5+20");
        assertEquals(25,rs);
    }

    @Test
    public void 빼기케이스(){
        int mn = Calculator.sub("10-2");
        assertEquals(8,mn);
    }
    @Test
    public void 빼기케이스_2(){
        int mn = Calculator.sub("5-10");
        assertEquals(-5, mn);
    }
}