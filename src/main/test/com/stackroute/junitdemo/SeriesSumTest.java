package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class SeriesSumTest {
    SeriesSum se;
    @Before
    public void setUp(){
        System.out.println("Inside before");
        se= new SeriesSum();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        se=null;

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
    public void givenNumbersShouldReturnCorrectMessage(){
        //arange
        String a[]={"1","2","3","0"};
        //Act
        String result= se.AddSeries(a);

        //Assert
        assertEquals("Sum of the numbers:6",result);

    }
    @Test
    public void givenCharacterShouldReturnErrorMessage(){
        //arange
        String a[]={"a","4","3","0"};
        //Act
        String result= se.AddSeries(a);

        //Assert
        assertEquals("Error: not a valid input",result);

    }

    @Test
    public void givenAnotherShouldReturnCorrectMessage(){
        //arange
        String a[]={"7",null,"3","0"};
        //Act
        String result= se.AddSeries(a);

        //Assert
        assertEquals("Error: not a valid input",result);

    }

}