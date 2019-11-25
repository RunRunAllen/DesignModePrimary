package com.example.designmode;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.text).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //状态模式 登录逻辑处理
                // startActivity(new Intent(MainActivity.this, TestActivity.class));

//
//                //领券
//                CouponConfig couponConfig = new CouponConfig.CouponConfigBuilder("real")
//                        .isCoupon(true)
//                        .isLeavePhone(true).build();
//
//                CouponController.getInstance().init(couponConfig);
            }
        });


        //Builder
//        ComputerIml build = new ComputerIml.ComputerBuilder("15")
//                .color("")
//                .keybord("")
//                .mouse("")
//                .build();


//        ImageLoadConfig config = new ImageLoadConfig.ImageLoadConfigBuilder()
//                .setImageCache(new DoubleCache())
//                .build();
//        ImageLoad.getInstance().init(config);


//        ProtoTypePatternMode protoTypePatternMode = new ProtoTypePatternMode();
//        protoTypePatternMode.showDoc();


//        //状态模式的体现
//        TvControllerTwo tvControllerTwo = new TvControllerTwo();
//        tvControllerTwo.PowerOff();
//        tvControllerTwo.nextChanner();

    }
}