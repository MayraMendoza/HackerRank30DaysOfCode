package com.careerdevs.HackerRank30DaysOfCode;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * omplete the code in the editor below. The variables i,d ,s and  are already declared and initialized for you. You must:
 *
 * Declare 3 variables: one of type int, one of type double, and one of type String.
 * Read 3 lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your 3  variables.
 * Use the  operator to perform the following operations:
 * Print the sum of  i plus your int variable on a new line.
 * Print the sum of d plus your double variable to a scale of one decimal place on a new line.
 * Concatenate s with the string you read as input and print the result on a new line.
 */

public class Day1DataTypes {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int e = 3;
        double f = 3.0;
        String o = "hello";


        /* Read and save an integer, double, and String to your variables.*/

        int ee = scan.nextInt();
        double ff = scan.nextDouble();
        scan.nextLine();
        String oo = scan.nextLine();


        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        System.out.println(ee+ i);




        /* Print the sum of the double variables on a new line. */
        System.out.println(d+ ff);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */

        System.out.println(s + oo);

        scan.close();
    }
}