package com.LickingHieghts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //todo even or odd
        // todo keep number contained
        //todo get the last digit

        //we want to find if a number is even or odd
        testOdness();
        keepContained();

        }
    public static void testOdness() {
        int number;
        Scanner keyboard;

        keyboard = new Scanner(System.in);
        System.out.println("Give me a postive number");
        number = keyboard.nextInt();
        System.out.println("Number is even: " + (number % 2 == 0));
        System.out.println("Number is odd: " + (number % 2 != 0));
    }

    public static void keepContained(){
     // we want to keep a number contained
       int number;
       Scanner keyboard;
       keyboard= new Scanner(System.in);

       System.out.println("Give me a postive number");
        number = keyboard.nextInt();
        System.out.println("number contained is");
        System.out.println((number%8)+5);







    }
}
