package com.company;

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        System.out.println("Please enter a word to check for palindrome.");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        if (isPalindrome(word))
        {
            System.out.printf("The word %s is a palindrome", word);
        } else
        {
            System.out.printf("The word %s is not a palindrome", word);
        }

    }

    public static boolean isPalindrome(String word)
    {
        String reversedString = "";
        word = word.replaceAll("\\s+", "").toLowerCase(); // removes white spaces input so we can check for palindrome

        for (int i = word.length() - 1; i >= 0; i--)
        {
            reversedString = reversedString + word.charAt(i);
        }
        if (word.equals(reversedString))
        {
            return true;
        } else
        {
            return false;
        }
    }

}
