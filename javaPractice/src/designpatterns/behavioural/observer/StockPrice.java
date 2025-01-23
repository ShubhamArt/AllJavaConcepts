package designpatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class StockPrice implements Subject{
    private List<Observer> observers;
    private double price;

    public StockPrice() {
        observers = new ArrayList<>();
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
        notifyObservers();
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("Stock price has changed to: " + price);
        }
    }
}
