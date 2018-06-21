package com.acadtest.curs3_pb1;

public class TestPerson {

    public static void main(String[] args) {
        Person pers = new Person("Iulian","Tei");

        /* pers.Person("ion","adas");*/

        String name = pers.getName();
        String address = pers.getAddress();

        String overload = pers.toString();
        System.out.println(overload);

        Staff a1 = new Staff("ion","adr","nr1",123.33);
        String a= a1.toString();
        System.out.println(a);

        Student a2 = new Student("nelu","ad","test");
        String b = a2.toString();
        System.out.println(b);
    }


}
