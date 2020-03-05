package com.LickingHieghts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       testOdness();


        }
    public static void testOdness(){
        int number;
        Scanner keyboard;

        keyboard= new Scanner(System.in);
        System.out.println("Give me a postive number");
        number =  keyboard.nextInt();
        System.out.println("Number is even: "+(number % 2 == 0));
        System.out.println("Number is odd: "+(number % 2!= 0));














    }
}
