package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class ReverseStringTest {
    ReverseString rev;
    @Before
    public void setUp(){
        System.out.println("Inside before");
        rev= new ReverseString();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        rev=null;

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
    public void givenStringShouldReturnMessage(){
        //arange

        //Act
        String result= rev.RevString("London");

        //Assert
        assertEquals("nodnoL",result);

    }

    @Test
    public void givenNullShouldReturnErrorMessage(){
        //arange

        //Act
        String result= rev.RevString(null);

        //Assert
        assertEquals("Not allowed",result);

    }

    @Test
    public void givenCharacterShouldReturnMessage(){
        //arange

        //Act
        String result= rev.RevString("L");

        //Assert
        assertEquals("L",result);

    }

}