package com.testacademy.curs3;

public class Person {

    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    //overloading the constructor
    public Person(String name) {
            this(name,null);
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
        return super.toString("Person[name= "+name+", address="+address+"]");
    }



}
