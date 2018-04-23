package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.homework.interfaces.Observable;
import com.kodilla.patterns2.observer.homework.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class Student implements Observable {
    private final String studentName;
    private final List<Observer> observers;
    private final List<String> tasks;

    public Student(String name) {
        this.studentName = name;
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public List<String> getTasks() {
        return tasks;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void addTask(String task){
        tasks.add(task);
        notifyObservers();
    }
}
