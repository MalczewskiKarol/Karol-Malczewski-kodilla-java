//
//public class TestingMain {
//
//    public static void main(String[] args) {
//        SimpleUser simpleUser = new SimpleUser("theForumUser");
//
//        String result = simpleUser.getUserName();
//
//        if(result.equals("theForumUser")) {
//            System.out.println("test OK");
//        } else {
//            System.out.println("Error!");
//        }
//
//        System.out.println("Test - pierwszy test jednostkowy: ");
//    }
//}

package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;


public class TestingMain {

    public static void main(String[] args) {

        Calculator calculatorTest = new Calculator(4);

        int resultAdd = calculatorTest.getResultAdd();

        if (resultAdd == 4) {
            System.out.println("calculating [a + b] ... test OK! Answer is: " + resultAdd);
        } else {
            System.out.println("calculating [a + b] ... Error!");
        }


        Calculator calculatorTest1 = new Calculator(3);

        int resultSubstract = calculatorTest1.getResultSubstract();

        if (resultSubstract == 3) {
            System.out.println("calculating [c - d] ... test OK! Answer is: " + resultSubstract);
        } else {
            System.out.println("calculating [c - d] ... Error!");
        }
    }
}