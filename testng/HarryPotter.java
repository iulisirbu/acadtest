package com.testacademy.testng;

import org.testng.annotations.*;

public class HarryPotter {

    @BeforeSuite
    public void initSuite() {
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void initTest() {
        System.out.println("Before Tests");
    }

    @Test
    public void firstTest() {
        System.out.println("first test");

    }

    @Test
    public void secTest() {
        System.out.println("sec test");

    }

    @Test
    public void thirdTest() {
        System.out.println("third test");

    }

    @AfterTest
    public void closeSuite() {
        System.out.println("After Suite");
    }

    @AfterSuite
    public void closeSTests() {
        System.out.println("After Tests");
    }

}
