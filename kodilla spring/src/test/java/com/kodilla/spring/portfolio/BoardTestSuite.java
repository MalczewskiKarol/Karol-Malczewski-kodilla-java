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

        List<String> toDoList = new ArrayList<>();
        List<String> inProgressList = new ArrayList<>();
        List<String> doneList = new ArrayList<>();

        //When
        Board board = context.getBean(Board.class);

        board.toDoList.tasks.add("job#1");
//        board.inProgressList.tasks.add("job2");
//        board.doneList.tasks.add("job#3");

        //Then
        System.out.println(board.toDoList.tasks);
//        System.out.println(board.inProgressList.tasks);
//        System.out.println(board.doneList.tasks);

    }
}
