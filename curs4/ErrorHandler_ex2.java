package curs4;

public class ErrorHandler_ex2 {

    public static void main(String[] args) throws ArithmeticException {
        try {
            int a = 4; int b = 0;
            System.out.println(a/b);
        }catch (Exception e) {
            System.out.println("Problem with code detected" + "\n"+  e);
        }
    }


}
