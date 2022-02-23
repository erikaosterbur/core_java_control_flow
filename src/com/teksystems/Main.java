package com.teksystems;

public class Main {

    public static void main(String[] args) {
        problemOne();
        problemTwo();
        problemThree();
    }

    public static void problemOne () {
//        Write a program that declares 1 integer variable x, and then assign 7 to it
//        Write an if statement to print out “Less than 10” if x is less than 10
//        Change x to equal 15 and notice the result (console should not display anything)
        int x = 7;
        if(x<10){
            System.out.println("Less than 10");
        }
    }

    public static void problemTwo () {
//    Write a program that declares 1 integer variable x, and then assigns 7 to it.
//    Write an if-else statement that prints out “Less than 10” if x is less than 10 and “Greater than 10” if x is greater than 10
//    Change x to 15 and notice the result.
        int x = 15;
        String s = (x<10) ? "Less than 10" : "Greater than 10";
        System.out.println(s);
    }

    public static void problemThree () {
        /*
        * Write a program that declares 1 integer variable x, and then assigns 15 to it.
        * Write an “if-else-if” statement that prints out
        * “Less than 10” if x is less than 10,
        * “Between 10 and 20” if x is greater than 10 but less than 20,
        * and “Greater than or equal to 20” if x is greater than or equal to 20.
        * Change x to 50 and notice the result.
         */

        int x = 50;
        if(x<10){
            System.out.println("Less than 10");
        } else if(x>=10 && x<20){
            System.out.println("Between 10 and 20");
        } else if(x>=20){
            System.out.println("Greater than or equal to 20");
        }
    }


}
