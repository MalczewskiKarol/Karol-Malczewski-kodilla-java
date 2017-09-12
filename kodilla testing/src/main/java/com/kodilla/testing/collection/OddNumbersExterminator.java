package com.kodilla.testing.collection;
import java.lang.*;
import java.util.*;



public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        for (int n : numbers) {
            if (n % 2 == 0) {
                evenNumbers.add(n);
            }
        }

        return evenNumbers;
    }

    ArrayList<Integer> numbers = new ArrayList<Integer>();
    {
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
    }
}