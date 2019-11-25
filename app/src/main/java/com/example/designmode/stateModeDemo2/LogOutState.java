package com.example.designmode.stateModeDemo2;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * creation date: 2019-11-25 16:38
 * description ：
 */
class LogOutState implements UserState {
    @Override
    public void comment(Context context) {
        Log.i("haha", "========去登录-----");
        readLogin(context);
    }

    @Override
    public void login(Context context) {
        Log.i("haha", "========去登录-----");
        readLogin(context);

    }

    private void readLogin(Context context) {
        context.startActivity(new Intent(context, LoginActivity.class));
    }
}
