package com.mirkamolcode;

public class Main {

    static void main(String[] args) {
        int number = 0;

        // decrement operator: --
        System.out.println(number--); // the output will be 0
        System.out.println(number); // the output will be -1
        int numberTwo = 0;
        System.out.println(--numberTwo); // the output will be -1
        System.out.println(numberTwo); // the output will be -1

        // increment operator: ++
        System.out.println(number++); // the output will be 0
        System.out.println(number); // the output will be 1
        int numberThree = 0;
        System.out.println(++numberThree); // the output will be 1
        System.out.println(numberThree); // the output will be 1

        int number2 = 0;
        int incremet = number2 + 1;
        int decremet = number2 - 1;
        System.out.println(incremet); // the output will be 1
        System.out.println(decremet); // the output will be -1
    }
}
