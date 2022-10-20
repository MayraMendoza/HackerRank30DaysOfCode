package com.careerdevs.HackerRank30DaysOfCode;
/**
        *Given N names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers.
        * You will then be given an unknown number of names to query your phone book for. For each NAME  queried, print the associated entry from your phone book on a new line in the form name=phoneNumber;
        * if an entry for NAME  is not found, print Not found instead.
        *
        * Note: Your phone book should be a Dictionary/Map/HashMap data structure.
        */

public class Day9 {
    public static int factorial(int n) {
        if (n == 1) {
//            System.out.print("hit 1");
            return 1;
        }

        else {
            // return n * n-1 until n==1
        }
            return(n * factorial(n-1));
        }
}

