package com.mirkamolcode;

import java.awt.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
     // Create variables to store the strings and the result
        String string1 = "Hello";
        String string2 = "World";
        String result;

        // Compare the strings using the equals method
        if (string1.equals(string2)) {
            result = "Both strings are equal.";
        } else {
            result = "Both strings are not equal.";
        }

        // Print the result
        System.out.println(result);
    }
}

