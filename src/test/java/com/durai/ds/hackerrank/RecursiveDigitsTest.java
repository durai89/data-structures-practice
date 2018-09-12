package com.durai.ds.hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class RecursiveDigitsTest {

    @Test
    public void testRecursiveDigit() {
        int sum = RecursiveDigitSum.superDigit("123", 4);
        Assert.assertEquals(6, sum);
    }

}

