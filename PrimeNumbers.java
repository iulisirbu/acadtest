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
        System.out.println("Primele " + first + " numere prime sunt ");
        for (int i = 2; i <= n; i++)
            if (isPrime(i) == true) {
                count++;
                System.out.println(i);
                if (count == first) break;
            }
    }

    public static void main(String[] args) {
        int n = 222;
        if (isPrime(n)) {
            System.out.println("Numarul este prim");
        } else {
            System.out.println("Numarul nu este prim");
        }
        fifthPrimeNumber(n, 8);
    }
}
