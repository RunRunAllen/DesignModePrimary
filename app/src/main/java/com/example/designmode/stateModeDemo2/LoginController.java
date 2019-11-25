package com.example.designmode.stateModeDemo2;

import android.content.Context;

/**
 * creation date: 2019-11-25 15:22
 * description ：
 */
public class LoginController {

    UserState mUserState = new LogOutState();

    private LoginController() {
    }

    private static class LoginControllerHolder {
        private static final LoginController loginController = new LoginController();
    }

    public static LoginController getInstance() {
        return LoginControllerHolder.loginController;
    }


    public void setUserState(UserState mUserState) {
        this.mUserState = mUserState;
    }

    public void setComment(Context context) {
        mUserState.comment(context);
    }

    public void setLogin(Context context) {
        mUserState.login(context);
    }


}
