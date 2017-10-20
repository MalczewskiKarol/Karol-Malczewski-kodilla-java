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
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);

        List<String> toDoList = new ArrayList<>();
        List<String> inProgressList = new ArrayList<>();
        List<String> doneList = new ArrayList<>();

        //When
        toDoList.add("job#1");
        inProgressList.add("job#2");
        doneList.add("job#3");

        boolean board = context.containsBean("FirstList");
        boolean board2 = context.containsBean("SecondList");
        boolean board3 = context.containsBean("ThirdList");

        //Then
        System.out.println("Bean list#1 founded in the container |" + board + "|");
        System.out.println("Bean list#2 founded in the container |" + board2 + "|");
        System.out.println("Bean list#3 founded in the container |" + board3 + "|");
    }
}
