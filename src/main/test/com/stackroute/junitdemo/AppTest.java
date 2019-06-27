package com.stackroute.junitdemo;

import org.junit.*;

import java.sql.SQLOutput;

import static org.junit.Assert.*;

public class AppTest {
    App app;
    @Before
    public void setUp(){
        System.out.println("Inside before");
        app= new App();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        app=null;

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
    public void givenTwoStringShouldReturnConcatenanteUpperString(){
        //arange

        //Act
        String result= app.concatAndConvertString("Hello","World");

        //Assert
        assertEquals("HELLOWORLD",result);
    }
    @Test
    public void givenTwoNullShouldReturnErrorMessage(){
        //arange

        //Act
        String result= app.concatAndConvertString(null,null);

        //Assert
        assertEquals("Null not allowed",result);

    }
    @Test
    public void givenOneNullAndOneStringShouldReturnErrorMessage(){
        //arange

        //Act
        String result= app.concatAndConvertString("Hello",null);

        //Assert
        assertEquals("Null not allowed",result);

    }
    @Test
    public void givenOneEmptyStringAndOneNumericStringShouldReturnNumericString(){
        //arange
        App app= new App();
        //Act
        String result= app.concatAndConvertString("","5");

        //Assert
        assertEquals("5",result);

    }
}