package com.kodilla.patterns2.observer.homework;

public interface ExerciseMentorable {
    void registerMentor(ExerciseMentor exerciseMentor);
    void notifyMentors();
    void removeMentor(ExerciseMentor exerciseMentor);
}
