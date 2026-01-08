package com.mirkamolcode;

import java.awt.*;

public class Main {

    static void main(String[] args) {
       // Pass by value with Objects
        Point pointA = new Point(10, 10);
        Point pointB = pointA;

        pointA.x = 100;
        pointB.y = 90;

        System.out.println(pointA);
        System.out.println(pointB);
    }
}
