package com.careerdevs.HackerRank30DaysOfCode;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * Task
 * Given an array, A, of N integers, print A's elements in reverse order as a single line of space-separated numbers.
 * EXAMPLE  A=[1,2,3,4] -> Print 4 3 2 1. Each integer is separated by one space.
 * The first line contains an integer, N  (the size of our array).
 * The second line contains N space-separated integers that describe array A's elements.
 */



public class Day7Arrays {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        // System.out.print(arr.get(0));
        // System.out.print(arr.get(1));
        // System.out.print(arr.get(2));
        // System.out.print("start");
        for(int i=n-1; i>=0; i-=1){
            // System.out.print(i);
            System.out.print(arr.get(i)+" ");


        }

        bufferedReader.close();
    }
}
