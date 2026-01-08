package com.mirkamolcode;

import java.awt.*;
import java.util.Arrays;

public class Main {

    static void main(String[] args) {
        // Arrays
        int [] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 33;
        numbers[2] = 6;
        System.out.println(
                Arrays.toString(numbers)
        ); //[1, 33, 6]
        System.out.println(numbers); // [I@2a84aee7
        System.out.println(numbers.length); // 3

        int [] numbers2 = {0, 5, 6, 8, 9};
        System.out.println(numbers2.length); // 5

        String [] names = {"Jamila", "Alex"};
        System.out.println(Arrays.toString(names)); // [Jamila, Alex]
    }
}
