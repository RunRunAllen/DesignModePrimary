package com.example.designmode.stateModeDemo2;

import android.content.Context;
import android.util.Log;

/**
 * creation date: 2019-11-25 16:16
 * description ：
 */
public class LoginState implements UserState {


    @Override
    public void comment(Context context) {
        Log.i("haha", "========去评论-----");


    }

    @Override
    public void login(Context context) {

        Log.i("haha", "========去登录-----");

    }
}
