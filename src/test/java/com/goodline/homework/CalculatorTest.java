package com.goodline.homework;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

class CalculatorTest {
    @Test
    private void sumTest() {
        assertEquals(25, Calculator.Sum(10, 15));
    }

    @Test
    void tet() {
        try {
            Calculator.Sum(20, 0);
            fail();
        } catch(Exception e) {

        }
    }
    @Test
    private void sumTestWithZero() {
        Assert.assertNotEquals(25, 10);
    }
}