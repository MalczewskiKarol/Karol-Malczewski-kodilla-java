package com.kodilla.patterns2.observer.homework;

public interface ExerciseObservable {
    void registerMentor(ExerciseObserver exerciseObserver);
    void notifyMentors();
    void removeMentor(ExerciseObserver exerciseObserver);
}
