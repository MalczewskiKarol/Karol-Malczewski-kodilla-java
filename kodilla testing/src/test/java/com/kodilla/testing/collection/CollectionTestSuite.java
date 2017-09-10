package com.kodilla.testing.collection;
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
        ArrayList<ArrayList<Integer>> numbers = new ArrayList<ArrayList<Integer>>();
        //When
        numbers.clear();
        if(numbers.size() == 0) {
            System.out.println("List test: OK!");
        } else {
            System.out.println("Error!");
        }
    }

}
