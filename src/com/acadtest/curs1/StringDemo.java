package com.acadtest.curs1;

/**
 * @author Hulia Suliman (hulia@academiatestarii.ro)
 */
public class StringDemo {

    public static void main(String[] args) {

        //1. define a String and initialise a String (create String)
        String message = "Hello, World!";
        System.out.println(message);

        //2. the length of a String
        int messageLength = message.length();
        //should print 13
        System.out.println(messageLength);

        //3. concatenating Strings
        String firstName = "Cristi";
        String lastName = "Popescu";
        //should print Cristi Popescu
        System.out.println(firstName + " " + lastName);

        int age = 20;
        System.out.println("My age is " + age);
    }
}
