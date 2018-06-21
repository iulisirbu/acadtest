package com.acadtest.curs3_pb1;

public class Person {

    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    //overloading the constructor
    public Person(String name) {
        this(name, " ");
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        String temp = String.format("Person[name=%s,address=%s]", name, address);
        return temp;
    }


}
