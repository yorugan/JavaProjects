package com.company;

import java.util.Scanner;

public class FizzBuzz
{
    public static void main(String args[])
    {
        System.out.println("Welcome to com.company.FizzBuzz calculator. \nPlease enter a number you wish to calculate");

        Scanner input = new Scanner(System.in);
        int numberToBeCalculated = input.nextInt();
        int fizzBuzzCounter = 0, fizzCounter = 0, buzzCounter = 0;

        for(int i = 1; i<numberToBeCalculated+1; i++)
        {
            if(i%3 == 0 && i%5 == 0)  //Calculates com.company.FizzBuzz whenever the number is divisible by 3 or 5
            {
                System.out.println("com.company.FizzBuzz");
                fizzBuzzCounter++;
            }else if(i%3 == 0)
            {
                System.out.println("Fizz"); //Calculates Fizz whenever the number is divisible by 3
                fizzCounter++;
            }else if(i%5 == 0)
            {
                System.out.println("Buzz"); //Calculates Buzz whenever the number is divisible by 5
                buzzCounter++;
            }else
            {
                System.out.println(i);
            }
        }
        System.out.printf("Total number of Fizz were: %d", fizzCounter);
        System.out.printf("\nTotal number of Buzz were: %d", buzzCounter);
        System.out.printf("\nTotal number of com.company.FizzBuzz were: %d", fizzBuzzCounter);
    }
}
