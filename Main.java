package com.company;
/*  Take 2 values from command line argument and print sum of the two
value.
 */
public class Main {

    public static void main (String[] args) {
        // Line No. 9,10 are the java command line arguments
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum = a + b;
        System.out.println("Sum is " + sum);
    }
}
