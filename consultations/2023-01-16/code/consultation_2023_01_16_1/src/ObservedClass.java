import java.util.ArrayList;
import java.util.List;

public class ObservedClass implements Observable{
    private List<Observer> observers = new ArrayList<>();
    private String observedState;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
       observers.remove(observer);
    }

    @Override
    public void notifyObservers(String msg) {
        for (Observer observer:observers){
            observer.handleEvent(msg);
        }
    }

    public void setObservedState(String observedState) {
        String temp = this.observedState;
        this.observedState = observedState;
        notifyObservers("Поле изменило значение было: " +  temp + " стало: " + observedState);
    }
}
