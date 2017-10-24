package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {
    final String taskName;
    final String wantToBuy;
    final double quantity;

    public ShoppingTask(final String taskName, final String wantToBuy, final double quantity) {
        this.taskName = taskName;
        this.wantToBuy = wantToBuy;
        this.quantity = quantity;
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
        if(quantity > 0) {
            return true;
        } else {
            return false;
        }
    }
}
