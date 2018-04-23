package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask();
        System.out.println("Has " + shopping.getTaskName() + " been executed: " + shopping.isTaskExecuted());

        //Then
        Assert.assertEquals("Shopping Task", shopping.getTaskName());
    }

    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();
        System.out.println("Has " + driving.getTaskName() + " been executed: " + driving.isTaskExecuted());

        //Then
        Assert.assertEquals("Driving Task", driving.getTaskName());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        painting.executeTask();
        System.out.println("Has " + painting.getTaskName() + " been executed: " + painting.isTaskExecuted());

        //Then
        Assert.assertEquals("Painting Task", painting.getTaskName());
    }
}
