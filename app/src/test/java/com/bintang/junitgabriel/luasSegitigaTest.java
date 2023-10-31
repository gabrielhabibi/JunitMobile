package com.bintang.junitgabriel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class luasSegitigaTest {

    @Test
    public void testAddSuccess() {
        luasSegitiga calculator = new luasSegitiga();
        int result = calculator.add(10,10);
        assertEquals(50, result);
//        if (result != 50) {
//            throw new RuntimeException("Test gagal");
//        }
    }
}
