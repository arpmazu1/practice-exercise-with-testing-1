package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class CheckOriginalTest {
    CheckOriginal t;
    @Before
    public void setUp(){
        System.out.println("Inside before");
        t= new CheckOriginal();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        t=null;

    }
    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("Before class");

    }
    @AfterClass
    public static void tearDownBeforeClass(){
        System.out.println("After class");


    }
    @Test
    public void givenSmallerNumberShouldReturnMessage(){
        //arange

        //Act
        String result= t.Checker(56);

        //Assert
        assertEquals("Number guessed is less than original number",result);

    }
    @Test
    public void givenGreaterNumberShouldReturnMessage(){
        //arange

        //Act
        String result= t.Checker(86);

        //Assert
        assertEquals("Number guessed is more than original number",result);

    }
    @Test
    public void givenEqualNumberShouldReturnMessage(){
        //arange

        //Act
        String result= t.Checker(60);

        //Assert
        assertEquals("Number guessed matches the original number",result);

    }

}