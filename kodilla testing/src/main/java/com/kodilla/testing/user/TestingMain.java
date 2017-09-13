package com.kodilla.testing.user;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {

        System.out.println("Test - pierwszy test jednostkowy: ");

        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith"); // dodane realname zeby dzialalo :)

        String result = simpleUser.getUserName();

        if(result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }



        System.out.println("===============================================");
        System.out.println("Calculator - test: ");



        Calculator calculator = new Calculator();
        int add = calculator.add(5, 5);
        int substract = calculator.substract(10, 5);
        if(add == 10 && substract == 5) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }

}
