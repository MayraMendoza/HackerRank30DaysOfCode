package com.careerdevs.HackerRank30DaysOfCode;

public class ThisClass {

    private int number1 =1;
    private int number2=1;
    public int number3=1;


//    public ThisClass() {
//    }

    public ThisClass(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
        System.out.println(number1+number2);
    }
    public ThisClass(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
        System.out.println(number1+number2);
    }

    public int ThisClass(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
        return number1+number2;

    }

    @Override
    public String toString() {
//        if(number3==null){
//            return ""+ number1*number2;
//        }
        return " " + number1*number2*number3;
    }

    //    public ThisClass(int number1, int number2) {
//        this.number1 = number1;
//        this.number2 = number2;
//
//    }




//      public static int ThisClass(int number1, int number2){
//       int  result = number1+number2;
//        return result;
//    }



//    @Override
//    public String toString() {
//        return "{" +
//                "\"number1\":" + number1 +
//                ", \"number2\":" + number2 +
//                '}';
//    }
}
