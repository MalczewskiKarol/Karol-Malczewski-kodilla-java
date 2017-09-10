package com.kodilla.testing.collection;
import java.util.ArrayList;
import java.util.Random;



public class OddNumbersExterminator {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();


        Random theGenerator = new Random();
        for (int i = 0; i < 20; i++) {
            numbers.add(theGenerator.nextInt(20));
        }

        System.out.println(numbers);
        System.out.println("=============================");
        System.out.println(evenNumbers);

        public void exterminate(ArrayList<Integer> numbers) {
            int num = 0;
            for (int i = 0; i < numbers.size(); i++) {
                num = numbers.get(i);
                if (num % 2 == 0) {
                    evenNumbers.add(num);
                }
            }
        }
    }
}