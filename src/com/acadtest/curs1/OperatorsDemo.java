package com.acadtest.curs1;

/**
 * @author Hulia Suliman (hulia@academiatestarii.ro)
 */
public class OperatorsDemo {

    public static void main(String[] args) {

        System.out.println("--- Example 1 ---");
        //division (22 = 3*7 + 1) - should print 7
        int a = 22;
        int b = a / 3;
        System.out.println(b);

        System.out.println("--- Example 2 ---");
        //rest - //should print 1
        int c = a % 3;
        System.out.println(c);

        System.out.println("--- Example 3 ---");
        double d = a / 3;
        //should print 7.0 - why?
        System.out.println(d);

        System.out.println("--- Example 4 ---");
        d = 22d / 3;
        //should print 7.3333333 - because a is int
        //variable a has to be declared double as well
        System.out.println(d);

        System.out.println("--- Example 5 ---");
        // increment
        int i = 4;
        i++;
        System.out.println(i);

        System.out.println("--- Example 6 ---");
        // decrement
        i--;
        System.out.println(i);

        System.out.println("--- Example 7 ---");
        // not
        boolean isSunny = true;
        System.out.println(!isSunny);

        System.out.println("--- Example 8 ---");
        // compare
        boolean isBigger = 5 > 2;
        System.out.println(isBigger);
    }
}
