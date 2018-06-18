package com.testacademy;

import static com.testacademy.BubbleSort.*;
import static com.testacademy.ArrayCompare.*;
import static com.testacademy.ControlFlowStatements.*;
import static com.testacademy.PrimeNumbers.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int n = 127;
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
        findDistinct(arr, arr2);
        System.out.println("\n");

        /*
        find prime numbers
        */

        fifthPrimeNumber(n, 8);
        System.out.println("\n");
        /*
        Cautare index luna
        */

        binarySearchFor(months, "33v");
        binarySearchCase("asdasd");

        System.out.println("\n");
        if (isPrime(n)) {
            System.out.println("Numarul este prim");
        } else {
            System.out.println("Numarul nu este prim");
        }
    }
}
