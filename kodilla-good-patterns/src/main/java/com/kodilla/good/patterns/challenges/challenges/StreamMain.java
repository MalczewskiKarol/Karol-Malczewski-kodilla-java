package com.kodilla.good.patterns.challenges.challenges;

import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();
        movieStore.getMovies().entrySet().stream()
                .map(t -> t.toString())
                .forEach(System.out::println);




    }
}
