package org.example.designpatterns.observer.observer;

import org.example.designpatterns.observer.observable.StocksObservable;

public class EmailAlertObserver implements NotificationAlertObserver{
    StocksObservable observable;
    String email;
    public EmailAlertObserver(String email, StocksObservable observable) {
        this.observable = observable;
        this.email = email;
    }

    @Override
    public void update() {
        System.out.println("EMAIL: product A is back in stock with stock count: " + observable.getStockCount());
        sendEmail();
    }
    public void sendEmail(){
        System.out.println("mail sent to : " + email);
    }
}
