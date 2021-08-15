package com.epam.lib.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {


    @Test
    public void isPositiveNumberShouldReturnTrue() {
        String testNumber = "21";
        boolean expected = StringUtils.isPositiveNumber(testNumber);
        Assertions.assertTrue(expected);
    }
}