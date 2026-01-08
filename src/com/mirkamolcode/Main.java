package com.mirkamolcode;

public class Main {

    static void main(String[] args) {
        String amigos = "Amigos";
        String code = "code";
        String brand = amigos + code;
        System.out.println(brand.toUpperCase()); // AMIGOSCODE
        System.out.println(brand.toLowerCase()); // amigoscode
        System.out.println(brand.substring(6)); // code
        System.out.println(brand.substring(0,6)); // Amigos
        System.out.println("   ".isEmpty()); // fasle
        System.out.println("    ".isBlank()); // true, there is no text
        System.out.println("   a    "); //    a
        System.out.println("   a    ".trim()); // a, removes spaces
    }
}
