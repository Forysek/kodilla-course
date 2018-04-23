package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "Shopping Task";
    public static final String DRIVING = "Driving Task";
    public static final String PAINTING = "Painting Task";

    public final Task makeTask(final String taskType) {
        switch (taskType) {
            case SHOPPING:
                return new ShoppingTask("Shopping Task", "Onions", 2.0);
            case DRIVING:
                return new DrivingTask("Driving Task", "Home", "Car");
            case PAINTING:
                return new PaintingTask("Painting Task", "Beige", "Wall");
            default:
                return null;
        }
    }

}
