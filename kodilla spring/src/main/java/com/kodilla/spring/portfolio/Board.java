package com.kodilla.spring.portfolio;

public final class Board {
    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;

    public Board(final TaskList toDoList, final TaskList inProgressList, final TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }
}
