package com.kodilla.exception.challenge;

import java.util.stream.Stream;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {

        if(b == 0){

            try {

                throw new ArithmeticException();

            } catch (ArithmeticException e) {

                System.out.println("You cannot divide by 0!");

            } finally {

                System.out.println(":)");
            }
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}