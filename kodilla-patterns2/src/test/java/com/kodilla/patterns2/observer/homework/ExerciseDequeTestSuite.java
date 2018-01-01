package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

public class ExerciseDequeTestSuite {
    @Test
    public void testUpdate() {
        //Given
        ExerciseDeque first = new ExerciseDeque(1);
        ExerciseDeque second = new ExerciseDeque(2);
        ExerciseDeque third = new ExerciseDeque(3);
        Mentor adrianPażucha = new Mentor("Adrian Pażucha");
        Mentor jarominAndrzej = new Mentor("Andrzej Jaromin");
        first.registerMentor(adrianPażucha);
        second.registerMentor(adrianPażucha);
        third.registerMentor(jarominAndrzej);
        //When
        first.addExercise("OOP Programming");
        second.addExercise("AOP Programming");
        third.addExercise("FOP Programming");
        //Then
    }
}
