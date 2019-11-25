package com.example.designmode.stateModeDemo2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.designmode.R;

/**
 * creation date: 2019-11-25 15:19
 * description ：登录状态模式Demo
 */
public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.tv_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
                finish();
            }
        });


    }

    private void login() {
        // 1.请求接口
        //2.登录成功：
        LoginController loginController = LoginController.getInstance();
        loginController.setUserState(new LoginState());
        Log.i("haha", "========登录成功-----");
        Toast.makeText(getApplicationContext(), "登录成功", Toast.LENGTH_LONG).show();


    }
}
