package com.kodilla.testing.calculator;

import java.util.*;
import java.lang.*;
import java.io.*;


public class Calculator
{
    private int result;
    private int result1;

    public Calculator(int result, int result1) {
        this.result = result;
        this.result1 = result1;
    }

    public int getResult() {
        return result;
    }

    public int getResult1() {
        return result1;
    }

    public int result(int a, int b) {
        return a + b;
    }

    public int result1(int a, int b) {
        return a - b;
    }
}

class Application
{
    public static void main(String[] args) {

        Calculator calculator = new Calculator(10, 5);

        int result = calculator.result(5, 5);
        int result1 = calculator.result1(10, 5);

        System.out.println("a + b = " + result);
        System.out.println("a - b = " + result1);
    }
}