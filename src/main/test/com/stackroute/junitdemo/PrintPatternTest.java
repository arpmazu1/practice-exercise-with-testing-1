package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class PrintPatternTest {
    PrintPattern pat;
    @Before
    public void setUp(){
        System.out.println("Inside before");
        pat= new PrintPattern();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        pat=null;

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
        String result= pat.Pattern(5);

        //Assert
        assertEquals("122333444455555",result);

    }

    @Test
    public void givenZeroShouldReturnErrorMessage(){
        //arange

        //Act
        String result= pat.Pattern(0);

        //Assert
        assertEquals("Not allowed",result);

    }

    @Test
    public void givenAnotherNumberShouldReturnErrorMessage(){
        //arange

        //Act
        String result= pat.Pattern(2);

        //Assert
        assertEquals("122",result);

    }


}