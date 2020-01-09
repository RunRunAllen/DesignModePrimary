package com.example.designmode.observer;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * creation date: 2020-01-09 15:59
 * description ：
 */
public class Code implements Observer {
    private String name;

    public Code(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Log.i("haha","====更新啦----");

    }
}
