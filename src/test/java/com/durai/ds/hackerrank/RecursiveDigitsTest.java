package com.durai.ds.hackerrank;

import com.durai.competitive.problems.hackerrank.RecursiveDigitSum;
import org.junit.Assert;
import org.junit.Test;

public class RecursiveDigitsTest {

    @Test
    public void testRecursiveDigit() {
        int sum = RecursiveDigitSum.superDigit("123", 4);
        Assert.assertEquals(6, sum);
    }

}

