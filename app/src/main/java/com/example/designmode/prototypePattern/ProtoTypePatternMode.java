package com.example.designmode.prototypePattern;

/**
 * creation date: 2019-11-21 11:13
 * description ： 原型模式
 */
public class ProtoTypePatternMode {


    public ProtoTypePatternMode() {
    }

    public void showDoc() {
        WordDocument orginDoc = new WordDocument();
        orginDoc.setText("你好1");
        orginDoc.setImage("哈哈1");
        orginDoc.show();

        WordDocument secondDoc = orginDoc.clone();
        secondDoc.setText("你好2");
        secondDoc.setImage("哈哈2");

        secondDoc.show();

        orginDoc.show();
    }

}
