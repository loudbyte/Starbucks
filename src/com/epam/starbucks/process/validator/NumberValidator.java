package com.epam.starbucks.process.validator;

public class NumberValidator {
    public static boolean isNumeric(String str) {

        try
        {
            double d = Double.parseDouble(str);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }
}
