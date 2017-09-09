package com.kodilla.testing.collection;

import javafx.beans.binding.FloatExpression;

import java.util.*;
import java.lang.*;
import java.io.*;



public class OddNumbersExterminator {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> numbers = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
        numbers.add(oddNumbers);

        Random theGenerator = new Random();
        for (int i = 0; i < 20; i++) {
            numbers.add(theGenerator.nextInt(20));
        }

    public void exterminate(ArrayList<Integer> numbers) {
        int num = 0;
        for (int i = 0; i < numbers.size(); i++) {
            num = numbers.get(i);
            if (num % 2 == 0) {
                ArrayList<Integer> oddNumbers = null;
                oddNumbers.add(num);
                }
            }
        }
    }
}