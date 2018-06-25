package curs4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static curs4.ListOperations.*;


public class TestArrays {

    public static void main(String[] args) {

        List<String> testList = new ArrayList<>();
        List<String> reverseList = new ArrayList<>();
        List<String> clonedList = new ArrayList<>();
        List<String> copFalseList = new ArrayList<>();
        List<String> copTrueList = new ArrayList<>();


        //Adding elements to testList
        testList.add("Ana");
        testList.add("George");
        testList.add("Alex");
        testList.add("Bula");

        //Adding elements to copFalseList
        copFalseList.add("Anne");
        copFalseList.add("George");
        copFalseList.add("Alexander");
        copFalseList.add("Bush");

        //Adding elements to copTrueList
        copTrueList.add("Alex");
        copTrueList.add("Ana");
        copTrueList.add("Bula");
        copTrueList.add("George");

        //1. Sort a List
        sortList(testList);
        System.out.println("Sorted array list :");
        for (int i = 0; i < testList.size(); i++)
            System.out.println(testList.get(i));

        //2. Clone a List
        clonedList = cloneList(testList, clonedList);

        System.out.println("-------------");
        System.out.println("Cloned list is :");

        for (int i = 0; i < clonedList.size(); i++)
            System.out.println(clonedList.get(i));

        //3. Reverse a List
        System.out.println("-------------");
        System.out.println("Reversed list is :");

        reverseList = reverseList(testList);

        for (int i = 0; i < reverseList.size(); i++)
            System.out.println(reverseList.get(i));

/*        System.out.println("Lista originala-------------");
        for (int i=0;i<testList.size();i++)
            System.out.println(testList.get(i));
        System.out.println("-------------");

        System.out.println("Lista distincta-------------");
        for (int i=0;i<copFalseList.size();i++)
            System.out.println(copFalseList.get(i));
        System.out.println("-------------");

        System.out.println("Lista corecta-------------");
        for (int i=0;i<copTrueList.size();i++)
            System.out.println(copTrueList.get(i));
        System.out.println("-------------");*/

        //4. Compare some lists
        System.out.println("-------------");
        boolean a = compareList(testList, copFalseList);

        if (a == true)
            System.out.println("Listele testList, copFalseList sunt egale");
        else
            System.out.println("Listele testList, copFalseList sunt distincte");

        System.out.println("-------------");
        boolean b = compareList(testList, copTrueList);

        if (b == true)
            System.out.println("Listele testList, copTrueList sunt egale");
        else
            System.out.println("Listele testList, copTrueList sunt distincte");

        //5. empty a lista
        emptyList(testList);

        // 6.check if list is empty
        System.out.println("-------------");
        if (isEmptyList(testList))
            System.out.println("Dupa folosirea functiei emptyList lista a devenit goala");
        else System.out.println("Dupa folosirea functiei emptyList lista nu este goala");

    }


}
