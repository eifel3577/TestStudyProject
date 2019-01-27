package com.example.fujitsu.teststudyproject.utils;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class ConvertUtilsTest {

    @Test
    public void stringToInteger() {
        assertNotEquals(1, ConvertUtils.stringToInteger("2"));
        assertThat(-2,equalTo(ConvertUtils.stringToInteger("-2")));
        assertEquals(-2, ConvertUtils.stringToInteger("-2"));
        assertEquals(0, ConvertUtils.stringToInteger(""));
        assertEquals(0, ConvertUtils.stringToInteger("a"));
    }
}