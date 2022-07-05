package com.ll.exam;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {
    @Test
    public void 더하기() {
        int rs = 5 + 5;
        assertEquals(11, rs);
    }

    @Test
    public void 빼기(){
        int mn = 7 - 2;
        assertEquals(2,mn);
    }

    @Test
    public void 곱하기(){
        int x = 3 * 8;
        assertEquals(24,x);
    }
}