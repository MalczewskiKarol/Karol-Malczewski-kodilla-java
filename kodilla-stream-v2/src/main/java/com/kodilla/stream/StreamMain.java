package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("CALCULATING EXPRESSIONS WITH LAMBDAS");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("=============================");

        System.out.println("CALCULATING EXPRESSIONS WITH METHOD REFERENCES");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("=============================");

        System.out.println("BEUTIFULIER");

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("AAA", "BBB", "CCC", (a, b, c) -> a + "Text" + a);
        poemBeautifier.beautify("AAA", "BBB", "CCC", (a, b, c) -> b + "Text" + b);
        poemBeautifier.beautify("AAA", "BBB", "CCC", (a, b, c) -> c + "Text" + c);
        poemBeautifier.beautify("AAA", "BBB", "CCC", (a, b, c) -> "Text".toUpperCase());

        System.out.println("=============================");

        System.out.println("Using stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        System.out.println("=============================");

        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(s -> System.out.println(s));

        System.out.println("=============================");

        BookDirectory theBookDirectory = new BookDirectory();
        theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);
    }
}