package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
import java.util.Random;

public class CollectionTestSuite {
    Random generator = new Random();

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Collection test: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Collection test: end");
    }
    @Test
    public void testCaseOddNumbersExterminatorEmptyList() {
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        OddNumberExterminator emptyList = new OddNumberExterminator();
        ArrayList<Integer> result = emptyList.exterminate(oddNumbers);
        Assert.assertTrue(result.size() == 0);
    }
    @Test
    public void testCaseOddNumbersExterminatorNormalList(){
        ArrayList<Integer> allNumbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
            allNumbers.add( generator.nextInt( 10 ) );
        }

        OddNumberExterminator normalList = new OddNumberExterminator();
        ArrayList<Integer> result = normalList.exterminate(allNumbers);
        Assert.assertFalse(result.contains(1) || result.contains(3) || result.contains(5) || result.contains(7) || result.contains(9));
    }

}
