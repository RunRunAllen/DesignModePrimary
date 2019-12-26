package com.example.designmode;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.designmode.factoryMode.BaoMa;
import com.example.designmode.factoryMode.PatternFactory;
import com.example.designmode.factoryMode.PatternFactoryIml;

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


        //工厂模式
        PatternFactory patternFactory = new PatternFactoryIml();
        BaoMa car = patternFactory.createCar(BaoMa.class);
        car.drive();

    }
}