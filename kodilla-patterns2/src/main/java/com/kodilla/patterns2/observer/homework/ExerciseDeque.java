package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class ExerciseDeque implements ExerciseObservable {
    private List<ExerciseObserver> mentors;
    private ArrayDeque exercises;
    private int exerciseNumber;
    private String desc;

    public ExerciseDeque(int exerciseNumber, String desc) {
        this.mentors = new ArrayList<>();
        this.exercises = new ArrayDeque();
        this.exerciseNumber = exerciseNumber;
        this.desc = desc;
    }

    public void addExercise(String exercise) {
        exercises.add(exercise);
        notifyMentors();
    }

    @Override
    public void registerMentor(ExerciseObserver exerciseObserver) {
        mentors.add(exerciseObserver);
    }

    @Override
    public void notifyMentors() {
        for(ExerciseObserver exerciseObserver : mentors) {
            exerciseObserver.update(this);
        }
    }

    @Override
    public void removeMentor(ExerciseObserver exerciseObserver) {
        mentors.remove(exerciseObserver);
    }

    public ArrayDeque getExercises() {
        return exercises;
    }

    public int getExerciseNumber() {
        return exerciseNumber;
    }

    public String getDesc() {
        return desc;
    }
}