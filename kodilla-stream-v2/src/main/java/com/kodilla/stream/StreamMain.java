package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("CALCULATING EXPRESSIONS WITH LAMBDAS");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("CALCULATING EXPRESSIONS WITH METHOD REFERENCES");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("BEUTIFULIER");

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("AAA", "BBB", "CCC", (a, b, c) -> a + "Text" + a);
        poemBeautifier.beautify("AAA", "BBB", "CCC", (a, b, c) -> b + "Text" + b);
        poemBeautifier.beautify("AAA", "BBB", "CCC", (a, b, c) -> c + "Text" + c);
        poemBeautifier.beautify("AAA", "BBB", "CCC", (a, b, c) -> b + "Text".toUpperCase() + b);

        System.out.println("Using stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}