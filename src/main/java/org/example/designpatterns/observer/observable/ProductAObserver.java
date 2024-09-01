package org.example.designpatterns.observer.observable;

import org.example.designpatterns.observer.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class ProductAObserver implements  StocksObservable{
    List<NotificationAlertObserver> observers = new ArrayList<>();
    int stockCount;
    @Override
    public void add(NotificationAlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
            for(NotificationAlertObserver observer: observers){
                observer.update();
            }
    }

    @Override
    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
        notifySubscribers();
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
