package com.example.designmode.stateModeDemo2;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.designmode.R;

/**
 * creation date: 2019-11-25 15:18
 * description ：
 */
public class TestActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        findViewById(R.id.tv_test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //评论
                LoginController.getInstance().setComment(getApplicationContext());


            }
        });

        findViewById(R.id.tv_test_two).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //注销
                LoginController.getInstance().setUserState(new LogOutState());

            }
        });
    }
}
