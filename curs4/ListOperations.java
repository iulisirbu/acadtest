package curs4;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.*;

public class ListOperations {

    //1. Write a Java program to sort a given array list.
    public static void sortList(List list) {
        sort(list);
    }

    //2. Write a Java program to copy one array list into another
    public static List cloneList(List list1, List list2) {
        list2.clear();
        for (int i = 0; i < list1.size(); i++) {
            list2.add(list1.get(i));
        }
        return list2;
    }

    //3. Write a Java program to reverse elements in a array list.
    public static List reverseList(List list) {
        List<Object> tempList = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            tempList.add(list.get(i));
        }
        return tempList;
    }

    //4. Write a Java program to compare two array lists
    public static boolean compareList(List list1, List list2) {
        int counter = 0;
        if (list1.size() == list2.size()) {
            for (int i = list1.size() - 1; i >= 0; i--) {
                if (list1.get(i).equals(list2.get(i)))
                    counter++;
            }


        } else {
            return false;
        }

        if (counter == list1.size()) {
            return true;
        }
        return false;
    }

    public static boolean compareList2(List list1, List list2) {
        if (list1.contains(list2) && list1.size() == list2.size()) {
            return true;
        } else {
            return false;
        }

    }

    //5. Write a Java program to empty an array list.
    public static List emptyList(List list) {
        list.clear();
        return list;
    }

    public static boolean isEmptyList(List list) {
        if (list.isEmpty())
            return true;
        else
            return false;
    }


}
