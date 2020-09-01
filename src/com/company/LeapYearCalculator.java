package com.company;

public class LeapYearCalculator
{

    // Takes in a year and calculates whether the year is leap year or not
    // returns true if it is leap year
    public static boolean isLeapYear(int year)
    {
        if((year >= 1) && (year <= 9999))
        {
            if(((year%4 == 0) && (year%100 == 0) && (year%400 == 0)) || (year%4 == 0) && (year%100 != 0))
            {
                return true;
            }else
            {
                return false;
            }
        }else
        {
            return false;
        }
    }
}
