package com.testacademy;

public class BubbleSort {


    static void bubbleSortFor(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            //se parcurge vectorul de mai multe ori si se compara la fiecare pas doua elemente consecutive
            //aceasta se poate realiza folosind looping statements invatate la curs
            //in cazul de fata 2 for-uri
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    // daca arr[j-1] > arr[j] atunci
                    // cele doua valori se interschimba
                    // interschimbarea se realizeaza prin intermediul variabilei auxiliare temp
                    // care are acelaşi tip ca şi elementele vectorului
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }

    static void bubbleSortDoLoop(int[] arr) {
        int n = arr.length;
        int temp = 0;
        int ok = 0;
        while(ok!=1){
            //se parcurge vectorul folosind looping statements invatate la curs
            //in cazul de fata do-while loop si un for
            ok=1;
            //   In momentul in care este parcurs si nu se mai face nici o interschimbare (for-ul nu se mai executa)
            //    valoarea initiala ramane 1 si vectorul este sortat
            for(int i=0; i < arr.length-1; i++){
                if(arr[i] > arr[i+1]){
                    // daca arr[i-1] > arr[i] atunci
                    // cele doua valori se interschimba
                    ok=0;
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }

            }
        }

    }


    static void bubbleSortWhileLoop(int[] arr) {
        int n = arr.length;
        int temp = 0;
        int ok = 0;
        do{
            //se parcurge vectorul folosind looping statements invatate la curs
            //in cazul de fata do-while loop
            ok=1;
            //   In momentul in care este parcurs si nu se mai face nici o interschimbare (for-ul nu se mai executa)
            //    valoarea initiala ramane 1 si vectorul este sortat
            for(int i=0; i < arr.length-1; i++){
                if(arr[i] > arr[i+1]){
                    // daca arr[i-1] > arr[i] atunci
                    // cele doua valori se interschimba
                    ok=0;
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }

            }
        }while(ok!=1);

    }

    public static void main(String[] args) {
        int arr[]  ={2,44,9,44,19,91,55};
        int arr2[] ={4,55,43,6,74,620,99};
        int arr3[] ={3,22,13,7,5,62,22};

        System.out.println("Array 1 inainte de sortare");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nArray 2 inainte de sortare");
        for(int i=0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }

        System.out.println("\nArray 3 inainte de sortare");
        for(int i=0; i < arr3.length; i++){
            System.out.print(arr3[i] + " ");
        }

        bubbleSortFor(arr); //apelare sortare folosing looping statement de tip for
        bubbleSortDoLoop(arr2); //apelare sortare folosind looping statement de tip do
        bubbleSortWhileLoop(arr3); // sortare folosind while loop

        System.out.println("\nArray dupa sortare folosind Bubble Sort cu FOR");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nArray dupa sortare folosind Bubble Sort DO");
        for(int i=0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }

        System.out.println("\nArray dupa sortare folosind Bubble Sort WHILE");
        for(int i=0; i < arr3.length; i++){
            System.out.print(arr3[i] + " ");
        }

    }
}