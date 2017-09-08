package com.kodilla.testing.calculator;


    class Application
    {
        public static void main(String[] args) {

            Calculator calculator = new Calculator();

            int add = calculator.add(5, 5);
            int substract = calculator.substract(10, 5);

            System.out.println("a + b = " + add);
            System.out.println("a - b = " + substract);
        }
    }

