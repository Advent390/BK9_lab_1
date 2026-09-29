package observer;
import java.util.ArrayList;
import java.util.List;
/*
 * OBSERVER: Game повідомляє всіх підписаних Observer про події.
 * Доцільність: різні незалежні системи можуть реагувати на одну подію.
 */
public class Game {
    private final List<Observer> observers = new ArrayList<>();
    public void addObserver(Observer observer) { observers.add(observer); }
    public void removeObserver(Observer observer) { observers.remove(observer); }
    public void notifyObservers(String event) {
        for (Observer observer : observers) observer.update(event);
    }
}
