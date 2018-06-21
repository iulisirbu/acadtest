package com.testacademy.curs3_pb2;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        c1.getArea();
        double radius = c1.getRadius();

        Circle c2 = new Circle(10);
        c2.getArea();
        c2.getRadius();

        Circle c3 = new Circle(20,"blue");
        String color = c3.getColor();

        // c1.radius = 5.0;  no bcs radius has private access, in order to change his value we need to create a setter method
        c1.setRadius(5.2);

        //System.out.println(c1.radius); no bcs radius has private access, in order to change his value we need to create a getter method
        double radius = c1.getRadius();
        System.out.println(radius);

        c1.setColor("bej");

    }
}
