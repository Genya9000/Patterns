package Patterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private List<Observer> observers = new ArrayList<Observer>();
    private List<String> editions = new ArrayList<String>();
    public void addedition(String name) {
        editions.add(name);
        notifyObservers();
    }
    public void removeedition(String name) {
        editions.remove(name);
        notifyObservers();
    }
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.event(editions);
        }
    }
}
