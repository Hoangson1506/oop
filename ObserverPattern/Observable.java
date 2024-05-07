package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    protected List<Observer> observers;
    public Observable() {
        observers = new ArrayList<>();
    }
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObserver() {
        for(Observer observer : observers) {
            observer.update(this);
        }
    }
}
