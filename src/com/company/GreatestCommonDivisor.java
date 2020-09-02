package com.company;

import java.util.Scanner;
public class GreatestCommonDivisor
{
    public static int greatestCommonDivisor(int number1, int number2)
    {
        if (number2 == 0)
        {
            return number1;
        } else
        {
            return(greatestCommonDivisor(number2, number1 % number2));
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers for a great common divisor you wish to find.");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println("Great common divisor of " + number1 +" and " + number2 + " is: ");
        System.out.println(greatestCommonDivisor(number1, number2));


    }
}
