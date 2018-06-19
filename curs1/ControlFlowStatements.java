package com.testacademy.curs1;

public class ControlFlowStatements {
    
    /* Course 2 – Control Flow Statements and Arrays
    * Arrays - Exercises
    *
    * 18/06/2016
    */

    public static void binarySearchFor(String[] arr, String src) {
        String found = "Folosind functia de cautare FOR - elementul se afla pe pozitia : ";
        String notFound = "Folosind functia de cautare FOR - elementul nu a fost gasit";
        int ok = 0;
        for (int i = 0; i < arr.length; i++) {
            if (src.equals(arr[i])) {
                ok = i + 1;
            }
        }
        if (ok != 0) {
            System.out.println(found + (ok));
        } else
            System.out.println(notFound);
    }


    public static void binarySearchCase(String gasit) {
        int found = 0;

        switch (gasit) {
            case "jan":
                found = 1;
                System.out.println("Folosind functia de cautare case - elementul se afla pe pozitia : " + found);
                break;
            case "feb":
                found = 2;
                System.out.println("Folosind functia de cautare case - elementul se afla pe pozitia : " + found);
                break;
            case "mar":
                found = 3;
                System.out.println("Folosind functia de cautare case - elementul se afla pe pozitia : " + found);
                break;
            case "apr":
                found = 4;
                System.out.println("Folosind functia de cautare case - elementul se afla pe pozitia : " + found);
                break;
            case "mai":
                found = 5;
                System.out.println("Folosind functia de cautare case - elementul se afla pe pozitia : " + found);
                break;
            case "iun":
                found = 6;
                System.out.println("Folosind functia de cautare case - elementul se afla pe pozitia : " + found);
                break;
            case "iul":
                found = 7;
                System.out.println("Folosind functia de cautare case - elementul se afla pe pozitia : " + found);
                break;
            case "aug":
                found = 8;
                System.out.println("Folosind functia de cautare case - elementul se afla pe pozitia : " + found);
                break;
            case "sep":
                found = 9;
                System.out.println("Folosind functia de cautare case - elementul se afla pe pozitia : " + found);
                break;
            case "oct":
                found = 10;
                System.out.println("Folosind functia de cautare case - elementul se afla pe pozitia : " + found);
                break;
            case "nov":
                found = 11;
                System.out.println("Folosind functia de cautare case - elementul se afla pe pozitia : " + found);
                break;
            case "dec":
                found = 12;
                System.out.println("Folosind functia de cautare case - elementul se afla pe pozitia : " + found);
                break;
            default:
                System.out.println("Folosind functia de cautare case - elementul nu se regaseste in lista");
                break;
        }
    }
}

