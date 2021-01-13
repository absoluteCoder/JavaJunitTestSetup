package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JunitTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }
    @org.junit.Test
    public void testAssertions() {
        //test data
        assertEquals(3, calculator.add("1,2"));
        assertEquals(0, calculator.add(""));
        assertEquals(1, calculator.add("1"));
        assertEquals(1232323232, calculator.add("1232323232"));
        assertEquals(0, calculator.add(null));
    }
}