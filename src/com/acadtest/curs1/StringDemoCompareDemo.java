package com.acadtest.curs1;

/**
 * @author Hulia Suliman (hulia@academiatestarii.ro)
 */
public class StringDemoCompareDemo {

    public static void main(String[] args) {

        //7. compare equals
        String successWord = "Success";
        boolean equalsSuccess = successWord.equals("Success");
        //should print true
        System.out.println(equalsSuccess);

        equalsSuccess = successWord.equals("success");
        //should print false
        System.out.println(equalsSuccess);

        equalsSuccess = successWord.equals("Success!");
        //should print false
        System.out.println(equalsSuccess);

        //8. compare with equalsIgnoreCase
        String success1 = "Success! Logged in!";
        String success2 = "success! Logged in!";
        String success3 = "SUCCESS! Logged in!";
        String success4 = "SUCCESS! LOGGED IN!";
        String success5 = "Success! Logged in";

        boolean equalsIgnoreCaseSuccess = success1.equalsIgnoreCase(success2);
        //should print true
        System.out.println(equalsIgnoreCaseSuccess);

        equalsIgnoreCaseSuccess = success1.equalsIgnoreCase(success3);
        //should print true
        System.out.println(equalsIgnoreCaseSuccess);

        equalsIgnoreCaseSuccess = success1.equalsIgnoreCase(success4);
        //should print true
        System.out.println(equalsIgnoreCaseSuccess);

        equalsIgnoreCaseSuccess = success1.equalsIgnoreCase(success5);
        //should print false
        System.out.println(equalsIgnoreCaseSuccess);

        //9. compare with contains
        String successC = "Success! Logged in!";
        boolean containsSuccess = successC.contains("Success");
        //should print true
        System.out.println(containsSuccess);

        containsSuccess = successC.contains("success");
        //should print false
        System.out.println(containsSuccess);

        successC = successC.toLowerCase();
        //should print success! logged in!
        System.out.println(successC);
        containsSuccess = successC.contains("success");
        //should print true
        System.out.println(containsSuccess);

        //10. isEmpty
        String successE = "Success";
        boolean isEmpty = successE.isEmpty();
        //should print false
        System.out.println(isEmpty);

        String empty = "";
        isEmpty = empty.isEmpty();
        //should print true
        System.out.println(isEmpty);

        String nullMessage = null;
        //should print null
        System.out.println(nullMessage);

        //This will throw a NullPointerException
        isEmpty = nullMessage.isEmpty();
        System.out.println(isEmpty);
    }
}
