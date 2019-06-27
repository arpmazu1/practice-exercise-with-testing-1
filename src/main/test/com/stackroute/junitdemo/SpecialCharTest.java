package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class SpecialCharTest {
    SpecialChar chh;
    @Before
    public void setUp(){
        System.out.println("Inside before");
        chh= new SpecialChar();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        chh=null;

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
    public void givenOneCapitalLetterShouldReturnMessage(){
        //arange

        //Act
        String result= chh.Characterchecker("X");

        //Assert
        assertEquals("Capital letter",result);

    }
    @Test
    public void givenOneSmallLetterShouldReturnMessage() {
        //arange

        //Act
        String result = chh.Characterchecker("y");

        //Assert
        assertEquals("Small letter", result);
    }
    @Test
    public void givenOneSpecialcharacterShouldReturnMessage() {
        //arange

        //Act
        String result = chh.Characterchecker(">");

        //Assert
        assertEquals("Special character", result);
    }
    @Test
    public void givenANumberShouldReturnReturnMessage() {
        //arange

        //Act
        String result = chh.Characterchecker("4");

        //Assert
        assertEquals("Number", result);
    }

    @Test
    public void givenNullValueShouldReturnReturnMessage() {
        //arange

        //Act
        String result = chh.Characterchecker(null);

        //Assert
        assertEquals("Not allowed", result);
    }



}