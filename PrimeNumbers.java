package com.testacademy;

public class PrimeNumbers {

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

   public static void fifthPrimeNumber(int n) {
        int count = 0;
        int i = 0;
        System.out.println("Numerele naturale pana la al " + n + "-lea prim sunt : ");

         do{
            if (isPrime(i) == true)
                count++;
                System.out.println(i);
                i++;
            }while (count < n);
    }
}
