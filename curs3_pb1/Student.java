package com.testacademy.curs3_pb1;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;
    private String email;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public Student(String name, String address, String program) {
            this(name,address,program,1,0);
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return String.format("Student[%s,program=%s,year=%d,fee=%s]", super.toString(), program, year, fee);

    }

    private void setAddress(String address, String email) {
        super.setAddress(address);
        this.email=email;

    }
}
