package com.example.designmode;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.designmode.imageThrid.DoubleCache;
import com.example.designmode.imageThrid.ImageLoad;
import com.example.designmode.imageThrid.ImageLoadConfig;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Builder
//        ComputerIml build = new ComputerIml.ComputerBuilder("15")
//                .color("")
//                .keybord("")
//                .mouse("")
//                .build();
        ImageLoadConfig config = new ImageLoadConfig.ImageLoadConfigBuilder()
                .setImageCache(new DoubleCache())
                .build();
        ImageLoad.getInstance().init(config);

    }
}