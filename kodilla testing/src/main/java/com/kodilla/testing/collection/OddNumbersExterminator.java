package com.kodilla.testing.collection;
import java.util.ArrayList;



public class OddNumbersExterminator {
    public boolean clear;
    public boolean exterminate;

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        for (int n : numbers) {
            if (n % 2 == 0) {
                evenNumbers.add(n);
            }
        }
        return evenNumbers;

    }
}