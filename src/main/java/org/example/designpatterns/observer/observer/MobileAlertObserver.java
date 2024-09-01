package org.example.designpatterns.observer.observer;

import org.example.designpatterns.observer.observable.ProductAObserver;
import org.example.designpatterns.observer.observable.StocksObservable;

public class MobileAlertObserver implements NotificationAlertObserver{

    StocksObservable observable;
    String phoneNo;
    public MobileAlertObserver(String phoneNo, StocksObservable observable) {
        this.observable = observable;
        this.phoneNo = phoneNo;
    }

    @Override
    public void update() {
        System.out.println("SMS: Product A is back in stock with stock count: " + observable.getStockCount());
        sendSMS();
    }
    public void sendSMS(){
        System.out.println("SMS sent to : " + phoneNo);
    }
}
