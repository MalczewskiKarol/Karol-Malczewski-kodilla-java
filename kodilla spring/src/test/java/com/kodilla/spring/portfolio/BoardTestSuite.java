package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);

        //When
        Board board = context.getBean(Board.class);

        board.toDoList.tasks.add("task to do");
        board.inProgressList.tasks.add("task in progress");
        board.doneList.tasks.add("done task");

        //Then
        System.out.println(board.toDoList.tasks);
        System.out.println(board.inProgressList.tasks);
        System.out.println(board.doneList.tasks);

    }
}
