package com.durai.ds.hackerrank;

import java.math.BigInteger;

public class RecursiveDigitSum {

    private static BigInteger ZERO_BIGINT = BigInteger.valueOf(0);
    private static BigInteger TEN_BIGINT = BigInteger.valueOf(10);

    public static int superDigit(String n, int k) {
        BigInteger sum = calculateSumOfDigits(n, ZERO_BIGINT);
        if (k > 1) {
            sum = sum.multiply(BigInteger.valueOf(k));
        }

        if (sum.divide(TEN_BIGINT).compareTo(ZERO_BIGINT) >= 1) {
            return superDigit(sum.toString(), 1);
        }
        return sum.intValue();
    }

    private static BigInteger calculateSumOfDigits(String n, BigInteger sum) {
        sum = sum.add(new BigInteger(String.valueOf(n.charAt(0))));
        if (n.length() == 1) {
            return sum;
        }
        return calculateSumOfDigits(n.substring(1, n.length()), sum);
    }

}