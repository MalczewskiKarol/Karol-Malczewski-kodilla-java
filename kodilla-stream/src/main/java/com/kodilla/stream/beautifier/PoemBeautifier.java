package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String parameter1, String text, String parameter2, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(parameter1, text, parameter2);
        System.out.println(result);
    }
}
