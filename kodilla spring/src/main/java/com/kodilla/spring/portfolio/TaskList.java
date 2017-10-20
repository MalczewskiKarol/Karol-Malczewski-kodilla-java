package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;


public final class TaskList {
    public List<String> tasks = new ArrayList<>();

    public TaskList(final List<String> tasks) {
        this.tasks = new ArrayList<>();
    }
}
