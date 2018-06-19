package com.testacademy.curs1;

public class BubbleSort {


   public static void bubbleSortFor(int[] arr) {
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

   public static void bubbleSortDoLoop(int[] arr) {
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


   public static void bubbleSortWhileLoop(int[] arr) {
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

}