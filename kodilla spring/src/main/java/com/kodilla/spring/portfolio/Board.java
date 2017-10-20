package com.kodilla.spring.portfolio;

import org.springframework.stereotype.Service;


public final class Board {
    TaskList theList;

    public Board(final TaskList theList) {
        this.theList = theList;
    }

    private TaskList toDoList() {
        return theList;
    }

    private TaskList inProgressList() {
        return theList;
    }

    private TaskList doneList() {
        return theList;
    }
}
