package com.kodilla.exception.test;

import java.security.spec.ECFieldF2m;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {

            secondChallenge.probablyIWillThrowException(2.0, 2.0);

        } catch (Exception e) {

            System.out.println("Exception throwed!");

        } finally {

            System.out.println("done!");

        }
    }


}
