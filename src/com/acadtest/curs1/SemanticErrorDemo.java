package com.acadtest.curs1;

/**
 * @author Hulia Suliman (hulia@academiatestarii.ro)
 */
public class SemanticErrorDemo {

    public static void main(String[] args) {

        //1. If you uncomment these lines of code, you will encounter the following error message:
        // Operator '++' cannot be applied to 'boolean'
        //boolean b = true;
        //b++;

        //2. Division by 0 is not possible.
        //This will throw an ArithmeticException
        int a = 5/0;
        System.out.println(a);
    }
}
