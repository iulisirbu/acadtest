package curs4;

public class ErrorHandler_ex1 {

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
       try {
           int[] arr = new int[10];
           System.out.println(arr[101]);
       }catch (Exception e){
           System.out.println("Problem with code detected" + "\n"+  e);
       }

    }
}
