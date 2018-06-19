package com.testacademy.curs1;

import java.util.List;
import java.util.ArrayList;
import static com.testacademy.curs1.BubbleSort.*;


public class Array {
   /* Course 2 – Control Flow Statements and Arrays
    * Arrays - Exercises
    * Write a Java program to sum values of an array. 
    * Write a Java program to test if an array contains a specific value. 
    * Write a Java program to find the minimum value of an array. 
    * Write a Java program to find the maximum value of an array. 
    * Write a Java program to find on which index elements of tow arrays are different.
    *
    * 18/06/2016
    */
   
    public static int sumArrays(int[] arr1) {
        /* Write a Java program to sum values of an array */
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum = sum + arr1[1];
        }
        return sum;
    }

    public static boolean searchArray(int[] arr, int s) {
        /* Write a Java program to test if an array contains a specific value. */
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == s)
                return true;
        }
        return false;
    }

    public static int minArray(int[] arr) {
        /* Write a Java program to find the minimum value of an array. */
        bubbleSortFor(arr); //first we sort the array using the bubblesort method implemented in class BubbleSort
        return arr[0]; //then display the first element
    }

    public static int maxArray(int[] arr) {
        /* Write a Java program to find the maximum value of an array.  */
        bubbleSortFor(arr);
        return arr[arr.length - 1];

    }

    public static void findDistinct(int[] arr1, int[] arr2) {
        /* Write a Java program to find on which index elements of tow arrays are different. */
        boolean contains = false;
        List<Integer> auxArr = new ArrayList<Integer>();
        List<String> index = new ArrayList<String>();

        /*int[] sortedFirst = bubbleSortFor(arr1);
        int[] sortedSecond = bubbleSortFor(arr2);

        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
*/
        index.add("First String");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    contains = true;
                    break;
                }
            }
            if (contains != true) {
                auxArr.add(arr1[i]);
                index.add(String.valueOf(i));

            } else {
                contains = false;
            }
        }
        index.add("Second String");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    contains = true;
                    break;
                }

            }
            if (contains != true) {
                auxArr.add(arr2[i]);

                index.add(String.valueOf(i));

            } else {
                contains = false;
            }
        }
        for (int i = 0; i < auxArr.size(); i++) {
            System.out.print(auxArr.get(i) + " ");
        }

        System.out.print("\nPe pozitiile : " + index);
    }

   /* public static void main(String[] args) {
        int[] array1 = {5,2,8,4,6};
        int[] array2 = {3,4,1};

        findDistinct(array1,array2);

    }*/

}

