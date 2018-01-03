package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import java.util.Deque;

import static org.junit.Assert.assertEquals;

public class ExerciseDequeTestSuite {
    @Test
    public void testUpdate() {
        //Given
        ExerciseDeque first = new AopExercise();
        ExerciseDeque second = new OopExercise();
        ExerciseDeque third = new FunctionalExercise();

        Mentor adrianPazucha = new Mentor("Adrian Pazucha");
        Mentor jarominAndrzej = new Mentor("Andrzej Jaromin");

        first.registerMentor(adrianPazucha);
        second.registerMentor(adrianPazucha);
        third.registerMentor(jarominAndrzej);
        //When
        first.addExercise("OOP Programming");
        second.addExercise("AOP Programming");
        third.addExercise("Functional Programming");
        //Then
        assertEquals(2, adrianPazucha.getExerciseCount());
        assertEquals(1, jarominAndrzej.getExerciseCount());
    }
}