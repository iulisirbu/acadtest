package com.testacademy.practice;

public class ex1 {


 /*   Să  se  calculeze  şi  afişeze  câte  numere  naturale  de  patru  cifre,  împărţite la 67, dau restul 23.*/

    public static void main(String[] args) {
        int contor = 0;
        for (int i=1000;i<=9999;i++)
            if(i%67==23)
                contor++;
        System.out.println(contor);
    }



}
