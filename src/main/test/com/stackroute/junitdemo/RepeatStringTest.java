package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class RepeatStringTest {
    RepeatString rev;
    @Before
    public void setUp(){
        System.out.println("Inside before");
        rev= new RepeatString();
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
    public void givenNumberShouldReturnMessage(){
        //arange

        //Act
        String result= rev.Repeat("Stackroute",2);

        //Assert
        assertEquals("Stackroutetete",result);

    }

    @Test
    public void givenZeroShouldReturnMessage(){
        //arange

        //Act
        String result= rev.Repeat("Stackroute",0);

        //Assert
        assertEquals("Stackroute",result);

    }

    @Test
    public void givenNullStringShouldReturnErrorMessage(){
        //arange

        //Act
        String result= rev.Repeat(null,4);

        //Assert
        assertEquals("Not allowed",result);

    }

}