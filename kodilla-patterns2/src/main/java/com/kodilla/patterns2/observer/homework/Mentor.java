package com.kodilla.patterns2.observer.homework;

public class Mentor implements ExerciseObserver {
    private final String userName;
    private int exerciseCount;

    public Mentor(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(ExerciseDeque exerciseDeque) {
        System.out.println(getUserName() + " New exercise to check - " + exerciseDeque.getDesc() + "\n" + "Exercises to check [" + getDequeCount() + "]");
        exerciseCount++;
    }

    public String getUserName() {
        return userName;
    }

    public int getExerciseCount() {
        return exerciseCount;
    }

    public int getDequeCount() {
        return exerciseCount + 1;
    }
}