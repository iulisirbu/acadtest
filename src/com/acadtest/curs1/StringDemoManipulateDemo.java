package com.acadtest.curs1;

/**
 * @author Hulia Suliman (hulia@academiatestarii.ro)
 */
public class StringDemoManipulateDemo {

    public static void main(String[] args) {

        //4. substring
        String success = "Success! Logged in!";
        String successSubstring = success.substring(9);
        //should print Logged in! - 9 is the beginIndex
        System.out.println(successSubstring);

        String successSubstring2 = success.substring(0, 7);
        //should print Success
        System.out.println(successSubstring2);

        String message = "Hello, World!";

        //5. to lower case
        String messageLowerCase = message.toLowerCase();
        //should print hello, world!
        System.out.println(messageLowerCase);

        //6. to upper case
        String messageUpperCase = message.toUpperCase();
        //should print HELLO, WORLD!
        System.out.println(messageUpperCase);
    }
}
