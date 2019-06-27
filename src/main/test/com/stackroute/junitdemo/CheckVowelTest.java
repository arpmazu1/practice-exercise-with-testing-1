package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class CheckVowelTest {
    CheckVowel ch;
    @Before
    public void setUp(){
        System.out.println("Inside before");
        ch= new CheckVowel();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        ch=null;

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
    public void givenAStringShouldReturnConcatenanteUpperString(){
        //arange

        //Act
        String result= ch.Checker("ap");

        //Assert
        assertEquals(" Vowel Consonent",result);
    }

    @Test
    public void givenAVowelShouldReturnConcatenanteUpperString(){
        //arange

        //Act
        String result= ch.Checker("E");

        //Assert
        assertEquals(" Vowel",result);
    }

    @Test
    public void givenAConsonenShouldReturnConcatenanteUpperString(){
        //arange

        //Act
        String result= ch.Checker("G");

        //Assert
        assertEquals(" Consonent",result);
    }

    @Test
    public void givenNullValueShouldReturnConcatenanteUpperString(){
        //arange

        //Act
        String result= ch.Checker(null);

        //Assert
        assertEquals("Not allowed",result);
    }
}