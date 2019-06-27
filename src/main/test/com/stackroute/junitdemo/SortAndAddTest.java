package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class SortAndAddTest {
    SortAndAdd s;
    @Before
    public void setUp(){
        System.out.println("Inside before");
        s= new SortAndAdd();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        s=null;

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
    public void givenNumberShouldReturnMessage(){
        //arange

        //Act
        String result= s.Sadd(521463);

        //Assert
        assertEquals("654321\nSum is12\nTrue",result);

    }

    @Test
    public void givenNumberShouldReturnAnotherMessage(){
        //arange

        //Act
        String result= s.Sadd(8295762);

        //Assert
        assertEquals("9876522\nSum is18\nFalse",result);

    }

    @Test
    public void givenSingleDigitNumberShouldReturnMessage(){
        //arange

        //Act
        String result= s.Sadd(0);

        //Assert
        assertEquals("0\nSum is0\nTrue",result);

    }

}