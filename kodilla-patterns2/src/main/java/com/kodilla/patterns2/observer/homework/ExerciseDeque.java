package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Observable;

import java.util.ArrayList;
import java.util.List;

public class ExerciseDeque implements ExerciseMentorable {
    private List<ExerciseMentor> mentors;
    private final List<String> exercises;
    private int exerciseNumber;

    public ExerciseDeque(int exerciseNumber) {
        this.exercises = new ArrayList<>();
        this.exerciseNumber = exerciseNumber;
    }

    public void addExercise(String exercise) {
        exercises.add(exercise);
        notifyMentors();
    }

    @Override
    public void registerMentor(ExerciseMentor exerciseMentor) {
        mentors.add(exerciseMentor);
    }

    @Override
    public void notifyMentors() {
        for(ExerciseMentor exerciseMentor : mentors) {
            exerciseMentor.update(this);
        }
    }

    @Override
    public void removeMentor(ExerciseMentor exerciseMentor) {
        mentors.remove(exerciseMentor);
    }

    public int getExerciseNumber() {
        return exerciseNumber;
    }
}
