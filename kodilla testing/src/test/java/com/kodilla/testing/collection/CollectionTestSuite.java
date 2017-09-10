package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
public void before() {
    System.out.println("Test Case: begin");
}
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator numbersExterminator = new OddNumbersExterminator();
        //When
        boolean result = numbersExterminator.clear;
        System.out.println("Testing 1 " + result);
        //Then
        Assert.assertTrue(result);

    }
    @Test
    public void TestOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator numbersExterminator1 = new OddNumbersExterminator();
        //When
        boolean result = numbersExterminator1.exterminate(ArrayList<Integer> numbers);
        System.out.println("Testing 2 " + result);
        //Then
        Assert.assertTrue(result);
    }

}
