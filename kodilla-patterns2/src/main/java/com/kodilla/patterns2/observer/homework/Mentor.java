package com.kodilla.patterns2.observer.homework;

public class Mentor implements ExerciseObserver {
    private final String userName;
    private int exerciseCount;

    public Mentor(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(ExerciseDeque exerciseDeque) {
        System.out.println(userName + " New exercise to check." + "\n" + "Exercises to check [" + getExerciseCount() + "]");
        exerciseCount++;
    }

    public String getUserName() {
        return userName;
    }

    public int getExerciseCount() {
        return exerciseCount;
    }
}
