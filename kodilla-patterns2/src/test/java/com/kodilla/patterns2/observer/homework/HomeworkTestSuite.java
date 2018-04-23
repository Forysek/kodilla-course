package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {
    @Test
    public void testHomework() {
        //Given
        Student uno = new Student("Uno");
        Student dos = new Student("Dos");
        Mentor geraltFromRivia = new Mentor("Geralt from Rivia");
        Mentor vernonRoche = new Mentor("Vernon Roche");
        Mentor vesemir = new Mentor("Vesemir");
        uno.registerObserver(geraltFromRivia);
        dos.registerObserver(vernonRoche);
        uno.registerObserver(vesemir);
        dos.registerObserver(vesemir);

        //When
        uno.addTask("Task 1");
        uno.addTask("Task 2");
        dos.addTask("Task 1");
        uno.addTask("Task 3");
        dos.addTask("Task 2");

        //Then
        assertEquals(3, geraltFromRivia.getUpdateCount());
        assertEquals(2, vernonRoche.getUpdateCount());
        assertEquals(5, vesemir.getUpdateCount());
    }

    @Test
    public void testUnregistering(){
        //Given
        Student uno = new Student("Uno");
        Student dos = new Student("Dos");
        Mentor vesemir = new Mentor("Vesemir");
        Mentor ciri = new Mentor("Ciri");
        uno.registerObserver(vesemir);
        dos.registerObserver(ciri);
        dos.removeObserver(ciri);

        //When
        uno.addTask("Task 1");
        dos.addTask("Task 1");

        //Then
        assertEquals(1, vesemir.getUpdateCount());
        assertEquals(0, ciri.getUpdateCount());
    }
}
