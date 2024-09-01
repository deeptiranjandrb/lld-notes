package org.example.designpatterns.observer;

import org.example.designpatterns.observer.observable.ProductAObserver;
import org.example.designpatterns.observer.observer.EmailAlertObserver;
import org.example.designpatterns.observer.observer.MobileAlertObserver;

public class Store {
    public static void main(String[] args) {
        ProductAObserver productA = new ProductAObserver();
        EmailAlertObserver emailNotifier = new EmailAlertObserver("drb@gmail.com",productA);
        MobileAlertObserver mobileNotifier = new MobileAlertObserver("999999",productA);

        productA.add(emailNotifier);
        productA.add(mobileNotifier);

        productA.setStockCount(3);
    }
}
