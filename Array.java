package com.testacademy;

import java.util.List;
import java.util.ArrayList;
import static com.testacademy.BubbleSort.*;


public class Array {

    public static int sumArrays(int[] arr1){
        int sum = 0;
        for(int i=0;i<arr1.length;i++){
            sum = sum + arr1[1];
        }
        return sum;
    }

    public static boolean searchArray(int[] arr, int s){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==s)
                return true;
        }
        return false;
    }

    public static int minArray(int[] arr) {
        bubbleSortFor(arr);
        return arr[0];
    }

    public static int maxArray(int[] arr) {
        bubbleSortFor(arr);
        return arr[arr.length-1];

    }

    public static void findDistinct(int[] arr1,int[] arr2){
        boolean contains = false;
        //int[] auxArr= new int[arr1.length];
        List<Integer> auxArr = new ArrayList<Integer>();

        for(int i=0;i<arr1.length;i++){
            for (int j=0;j<arr2.length;j++)
                if(arr1[i]==arr2[j]) {
                    contains = true;
                    break;
                }
            if(contains!=true){
                auxArr.add(arr1[i]);
            }
            else{
                contains = false;
            }
        }
        for (int i=0;i<auxArr.size();i++) {
            System.out.print(auxArr.get(i) + " ");
             }
        System.out.print("\nPe pozitiile : ");
        for (int i=0;i<auxArr.size();i++) {
            System.out.print(i + " ");
        }
    }
}