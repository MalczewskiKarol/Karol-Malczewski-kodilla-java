package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.DrivingTask;

public final class TaskFactory {
    public static final String SHOPPING_TASK = "SHOPPING TASK";
    public static final String PAINTING_TASK = "PAINTING TASK";
    public static final String DRIVING_TASK = "DRIVING TASK";

    public final Task makeTask(final String taskClass) {
        switch(taskClass) {
            case SHOPPING_TASK:
                return new ShoppingTask("Shopping task", "Cheese" + "Bread", 2 + 1);
            case PAINTING_TASK:
                return new PaintingTask("Painting task", "blue", "fence");
            case DRIVING_TASK:
                return new DrivingTask("Driving task", "Main Station", "Car");
            default:
                return null;
        }
    }
}
