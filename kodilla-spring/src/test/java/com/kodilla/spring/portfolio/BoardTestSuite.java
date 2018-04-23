package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.addTaskToList(board.getToDoList(), "Task To Do");
        board.addTaskToList(board.getInProgressList(), "Task In Progress");
        board.addTaskToList(board.getDoneList(), "Task Done");

        //Then
        Assert.assertEquals(board.getToDoList().tasks.get(0), "Task To Do");
        Assert.assertEquals(board.getInProgressList().tasks.get(0), "Task In Progress");
        Assert.assertEquals(board.getDoneList().tasks.get(0), "Task Done");


    }
}
