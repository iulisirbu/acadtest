package com.testacademy;

import java.util.List;
import java.util.ArrayList;

public class ArrayCompare {

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
        for (int var : auxArr) {
            System.out.print(var + " ");
        }

    }

    public static void main(String[] args) {
        int[] array1 = {1,2,3,5,6,67,4,234,56,6345,32};
        int[] array2 = {2,4,6,3,1,89,643,877,444,2323,222,0,999,32};

        findDistinct(array1,array2);

    }
}