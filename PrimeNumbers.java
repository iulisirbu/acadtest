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

    public static void fifthPrimeNumber(int n, int first) {
        int count = 0;
        System.out.print("Primele " + first + " numere prime sunt ");
        for (int i = 2; i <= n; i++)
            if (isPrime(i) == true) {
                count++;
                System.out.print(i + " ");
                if (count == first) break;
            }
    }
}
