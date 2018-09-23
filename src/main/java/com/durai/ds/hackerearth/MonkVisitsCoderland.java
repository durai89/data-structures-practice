package com.durai.ds.hackerearth;

import java.util.Scanner;

//https://www.hackerearth.com/practice/algorithms/greedy/basics-of-greedy-algorithms/practice-problems/algorithm/monk-visits-coderland-4/

public class MonkVisitsCoderland {

    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        int noOfTestCases = s.nextInt();

        for (int i = 0; i < noOfTestCases; i++) {
            int checkPoints = s.nextInt();
            long[] petrolPrice = new long[checkPoints];
            petrolPrice[0] = s.nextLong();
            long price;
            for (int j = 1; j < petrolPrice.length; j++) {
                price = s.nextLong();
                if (price > petrolPrice[j - 1]) {
                    petrolPrice[j] = petrolPrice[j - 1];
                } else {
                    petrolPrice[j] = price;
                }
            }
            long cost = 0;
            for (int k = 0; k < checkPoints; k++) {
                cost += petrolPrice[k] * s.nextLong();
            }
            System.out.println(cost);
        }
    }
}