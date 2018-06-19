package com.acadtest.curs1;

/**
 * @author Hulia Suliman (hulia@academiatestarii.ro)
 */
public class BasicDataTypesDemo {

    public static void main(String[] args) {

        System.out.println("--- Example 1 ---");
        //1. boolean data type can take 'true' or 'false' values
        boolean isSunny = true;
        System.out.println(isSunny);

        isSunny = false;
        System.out.println(isSunny);

        System.out.println("--- Example 2 ---");
        //2. int data type takes positive or negative values
        int age = 28;
        System.out.println(age);

        int stock = -300;
        System.out.println(stock);

        System.out.println("--- Example 3 ---");
        //3. double data type takes positive or negative values
        double price = 3.5d;
        System.out.println(price);

        double less = -100d;
        System.out.println(less);

        System.out.println("--- Example 4 ---");
        //4. convert int to double
        int a = 4;
        System.out.println(a);
        double intToDouble = (double) a;
        //should print 4.0 instead of 4 as int
        System.out.println(intToDouble);

        System.out.println("--- Example 5 ---");
        //5. convert double to int
        double d = 5.8d;
        System.out.println(d);
        int doubleToInt = (int) d;
        //should print 5 instead of 5.8 as int
        System.out.println(doubleToInt);
    }
}
