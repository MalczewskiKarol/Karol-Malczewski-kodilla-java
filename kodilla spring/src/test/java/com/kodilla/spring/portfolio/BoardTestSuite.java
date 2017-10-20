package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        List<String> toDoList = new ArrayList<>();
        toDoList.add("Job 1");

        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);

        //When
        boolean board = context.containsBean("Job 1");

        //Then
        System.out.println("Bean job #1  was found in the container " + board);

    }
}
