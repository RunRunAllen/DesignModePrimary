package com.example.designmode;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.designmode.Builder.Computer;
import com.example.designmode.Builder.ComputerIml;

import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Builder
        ComputerIml build = new ComputerIml.ComputerBuilder("15")
                .color("")
                .keybord("")
                .mouse("")
                .build();
    }
}