package com.kodilla.good.patterns.challenges;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        movieStore.getMovies().entrySet().stream()
                .map(t -> t.toString())
                .collect(Collectors.toList()).stream()

                .collect(Collectors.joining("!", "<<", ">>"));
                System.out.println(movieStore);




    }
}
