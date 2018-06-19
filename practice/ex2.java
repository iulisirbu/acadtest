package com.testacademy.practice;

public class ex2 {

  /*  2.Scrieţi o aplicaţie Java care să reconstituie scăderea: X X X – X  2 X --------- 8   7  9*/
  public static void main(String[] args) {



      int nr1 = 0;
      int nr2 = 0;
      int nr3 = 0;

      for(int i1=0;i1<=9;i1++)
          for(int i2=9;i2>=0;i2--)
              for(int i3=0;i3<=9;i3++)
                  for (int i4=0;i4<=9;i4++)
                      for (int i5=0;i5<=9;i5++) {
                          nr1 = 100 * i1 + 10 * i2 + i3;
                          nr2 = 100 * i4 + 20 + i5;
                          nr3 = nr1 - nr2;
                          if (nr3 == 879) {
                              System.out.println(i1 + " " + i2 + " " + i3);
                              System.out.println("-");
                              System.out.println(i4 + " 2 " + i5);
                              System.out.println("-----");
                              System.out.println("8 7 9 ");
                              System.out.println("\n");
                              break;
                          }
                      }

  }





}
