package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBfromA);

        System.out.println("Poem beautifier expressions with lambdas");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("^^^", "Nice text", "%%%", ((parameter1, text, parameter2) -> parameter1 + text + parameter2));
        poemBeautifier.beautify("!!!", "Very nice text", "@@@", ((parameter1, text, parameter2) -> parameter1 + text + parameter2));
        poemBeautifier.beautify("$$$", "Rich text", "$$$", ((parameter1, text, parameter2) -> parameter1 + text + parameter2));
        poemBeautifier.beautify(")*&", "Hell yeah!!", "&*(", ((parameter1, text, parameter2) -> parameter1 + text.toUpperCase() + parameter2));


    }
}
