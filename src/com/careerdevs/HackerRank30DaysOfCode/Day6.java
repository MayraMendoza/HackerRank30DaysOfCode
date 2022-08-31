package com.careerdevs.HackerRank30DaysOfCode;

import java.util.Scanner;

import java.io.*;
import java.util.*;

/**
 * Given a string, S , of length N that is indexed from 0 to N-1 , print its even-indexed and odd-indexed characters as 2 space-separated strings on a single line (see the Sample below for more detail).
 *
 * Note: 0 is considered to be an even index.
 */

public class Day6{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner input = new Scanner(System.in);
        int wordNum = input.nextInt();
        input.nextLine();

        // System.out.print(wordNum);

        // System.out.print("1");
        for(int i = 0; i<wordNum; i++){
            String word = input.next();
            // System.out.print( word);
            String even = "";
            String odd = "";
            for(int k = 0; k<word.length(); k ++){
                if(k % 2== 0 || k ==0){
                    //    System.out.print(word.charAt(k));
                    even +=  (word.charAt(k));
                } else {
                    odd +=  (word.charAt(k));
                }
            }


            System.out.println( even +" "+ odd);
            // System.out.println( odd);
            // System.out.println(word.length());

            // System.out.print( word.charAt(0));
            // System.out.print( word.charAt(2));
            //  System.out.print( word.charAt(3));
        }


    }
}

