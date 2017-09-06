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
        Calculator calculator = new Calculator(10, 5);
        int result = calculator.getResult();
        int result1 = calculator.getResult1();
        if(result == 10 && result1 == 5) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}