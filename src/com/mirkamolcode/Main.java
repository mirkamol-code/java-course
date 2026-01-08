package com.mirkamolcode;
/* This is public keyword: an access modifier
that allows method to be accessible from anywhere
 */
public class Main {
    /*
        1. Static: Indicates that the method belongs to the class, rather than instances of the class.
        This means it can be called without creating an object of the class
        2. void: specifies that the method does not return any value.
        3. main: This is the entry point of any Java program.
        The Java Virtual Machine (JVM) looks for this method to start execution.
        4. The public static void main(String[] args) method is the entry point of any Java application.
        When you run a Java program, the JVM calls the main method to start the execution of the program.
        The String[] args parameter is used to pass command-line arguments to the program.
   */
     static void main(String[] args) {
         // this is comment
         /* this is a multiline comment
         Multi
         line
         code
          */
        System.out.println("Hello Java");
     }
}
