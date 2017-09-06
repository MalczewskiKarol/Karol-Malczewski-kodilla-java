package com.kodilla.testing.calculator;

public class Calculator {

    private int result;

    public Calculator(int result) {
        this.result = result;
    }

    public int getResultAdd() {
        int resultAdd = 0;
        return resultAdd;
    }

    public int getResultSubstract() {
        int resultSubstract = 0;
        return resultSubstract;
    }

    public int addAToB(int a, int b) {
        return a + b;
    }

    public int substractAFromB(int c, int d) {
        return c - d;
    }
}

class App {
    public static void main(String[] args) {



        Calculator calculator = new Calculator(4);
        int resultAdd = calculator.addAToB(2, 2);
        System.out.println("a + b = " + resultAdd);

        Calculator calculator1 = new Calculator(3);
        int resultSubstract = calculator1.substractAFromB(4, 1);
        System.out.println("c - d = " + resultSubstract);

    }
}
