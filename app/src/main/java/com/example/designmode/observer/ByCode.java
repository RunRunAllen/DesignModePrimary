package com.example.designmode.observer;

import java.util.Observable;

/**
 * creation date: 2020-01-09 16:01
 * description ：
 */
public class ByCode extends Observable {

    public void postMessage(String content) {
        setChanged();
        notifyObservers(content);

    }
}
