package com.testacademy.curs1;

import static com.testacademy.curs1.BubbleSort.*;
import static com.testacademy.curs1.ControlFlowStatements.*;
import static com.testacademy.curs1.PrimeNumbers.*;

public class Main {

    public static void main(String[] args) {
    /* Course 2 – Control Flow Statements and Arrays
    * Arrays - Exercises
    *
    * 18/06/2016
    */

        int n = 7;
        String months[] = {"ian", "feb", "mar", "apr", "mai", "iun", "iul", "aug", "sep", "oct", "nov", "dec"};
        int arr[] = {2, 44, 9, 44, 19, 91, 55};
        int arr2[] = {4, 55, 43, 6, 74, 620, 99};
        int arr3[] = {3, 22, 13, 7, 5, 62, 22};

        System.out.print("Array 1 inainte de sortare : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nArray 2 inainte de sortare : ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.print("\nArray 3 inainte de sortare : ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();

        bubbleSortFor(arr); //apelare sortare folosing looping statement de tip for
        bubbleSortDoLoop(arr2); //apelare sortare folosind looping statement de tip do
        bubbleSortWhileLoop(arr3); // sortare folosind while loop

        System.out.print("\nArray dupa sortare folosind Bubble Sort cu FOR : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nArray dupa sortare folosind Bubble Sort DO : ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.print("\nArray dupa sortare folosind Bubble Sort WHILE : ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println("\n");

        /*
        Compare arrays
        */
        System.out.print("Elementele distincte dintre cele doua stringuri sunt : ");
        Array.findDistinct(arr, arr2);
        System.out.println("\n");

        /*
        find prime numbers
        */

        fifthPrimeNumber(n);
        System.out.println("\n");
        /*
        Cautare index luna
        */
        
        /*   
        * Write a Java program that takes the name of a month and prints its index in a year. 
        * Test Data: Input: March and Output message: The index is 3. Hint: use switch statement 
        */
        
        binarySearchFor(months, "33v");
        binarySearchCase("asdasd");

        System.out.println("\n");
        if (isPrime(n)) {
            System.out.println("Numarul este prim");
        } else {
            System.out.println("Numarul nu este prim");
        }

        /*
        Suma vector
        */
        System.out.println("Suma vectorului este :" + Array.sumArrays(arr));
        System.out.println("\n");

        /*
        Search in an array
        */

        boolean found = Array.searchArray(arr,2);
        if (found)
            System.out.println("Elementul a fost gasit");
        else
            System.out.println("Elementul nu a fost gasit");


        //min
        System.out.println("Min este : " + Array.minArray(arr));

        //max
        System.out.println("Max este : " + Array.maxArray(arr));
    }
}
