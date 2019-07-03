package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class CheckPalindromeTest {
    CheckPalindrome pal;
    @Before
    public void setUp(){
        System.out.println("Inside before");
        pal= new CheckPalindrome();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        pal=null;

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
    public void givenPalindromeNumberShouldReturnCorrectMessage(){
        //arange

        //Act
        String result= pal.palindrome(121);

        //Assert
        assertEquals("Palindrome. Sum is smaller then 25",result);
    }
    @Test
    public void givenPalindromeNumberSumGreaterShouldReturnCorrectMessage(){
        //arange

        //Act
        String result= pal.palindrome(4685864 );

        //Assert
        assertEquals("Palindrome. Sum is greater then 25",result);
    }
    @Test
    public void givenNonPalindromeNumberShouldReturnErrorMessage(){
        //arange

        //Act
        String result= pal.palindrome(1234 );

        //Assert
        assertEquals("Not Palindrome",result);
    }

    @Test
    public void givenNegativeNumberShouldReturnErrorMessage(){
        //arange

        //Act
        String result= pal.palindrome(-1234 );

        //Assert
        assertEquals("negative value",result);
    }
}