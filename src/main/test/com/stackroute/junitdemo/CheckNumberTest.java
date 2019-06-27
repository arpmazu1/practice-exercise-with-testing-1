package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class CheckNumberTest {
    CheckNumber cnum;
    @Before
    public void setUp(){
        System.out.println("Inside before");
        cnum= new CheckNumber();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        cnum=null;

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
    public void givenEvenNumberShouldReturnMessage(){
        //arange

        //Act
        String result= cnum.CheckNum(22);

        //Assert
        assertEquals("Jerry",result);
    }
    @Test
    public void givenOddNumberShouldReturnMessage(){
        //arange

        //Act
        String result= cnum.CheckNum(25);

        //Assert
        assertEquals("Tom",result);
    }
    @Test
    public void givenOutOfRangeShouldErrorMessage(){
        //arange

        //Act
        String result= cnum.CheckNum(45);

        //Assert
        assertEquals("Not found",result);
    }

}