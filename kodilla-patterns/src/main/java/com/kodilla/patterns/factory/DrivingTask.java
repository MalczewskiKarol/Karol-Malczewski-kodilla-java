package com.kodilla.patterns.factory;

import com.kodilla.patterns.factory.tasks.Task;

public final class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public String executeTask() {
        return "the task is executing";
    }

    @Override
    public boolean isTaskExecuted() {
        if (executeTask() != null) {
            return true;
        } else {
            return false;
        }
    }
}
