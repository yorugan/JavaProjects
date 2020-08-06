package com.company;

import java.util.Scanner;

public class ReverseStringRecursion
{
    public static void main(String[] args)
    {
        System.out.println("Enter a string and the program will reverse and print it out.");

        Scanner input = new Scanner(System.in);

        String userInput = input.nextLine();
        String reversedString = reverseString(userInput);

        System.out.printf("Reversed string is: %s", reversedString);
    }

    public static String reverseString(String stringInput)
    {
        if(stringInput.isEmpty())
        {
            System.out.println("You haven't entered a string");
            return stringInput;
        }
        return reverseString(stringInput.substring(1)) + stringInput.charAt(0);
    }
}
