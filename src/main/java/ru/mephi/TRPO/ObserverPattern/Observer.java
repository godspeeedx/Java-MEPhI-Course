package ru.mephi.TRPO.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void event(List<String> strings);
}

class University {
    private List<Observer> observers = new ArrayList<>();
    private List<String> students = new ArrayList<>();

    public void addStudent(String name) {
        students.add(name);
        notifyObservers();
    }

    public void removeStudent(String name) {
        students.remove(name);
        notifyObservers();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.event(students);
        }
    }
}

class Director implements Observer {
    public void event(List<String> strings) {
        System.out.println("The list of students has changed: " + strings);
    }
}

