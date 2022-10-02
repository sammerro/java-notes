package behavioral.mediator_exc;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    private List<Observer> observers = new ArrayList<Observer>();

    public void addEventHandler(Observer observer) {
        observers.add(observer);
    }
    protected void notifyObservers() {
        for (Observer observer : observers) {
            observer.handleEvent();
        }
    }
}
