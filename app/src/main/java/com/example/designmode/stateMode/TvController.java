package com.example.designmode.stateMode;

/**
 * creation date: 2019-11-22 16:52
 * description ： 状态模式 ：当一个对象的内在状态改变时允许其改变其行为，这个对象看起来像是改变了其类。
 */
public class TvController {

    private static final int POW_ON = 1;
    private static final int POW_OFF = 2;
    private static int mState = POW_OFF;

    public void powerOn() {
        mState = POW_ON;
        if (mState == POW_OFF) {
            System.out.println("开机啦");
        }
    }

    public void powerOff() {
        mState = POW_OFF;
        if (mState == POW_ON) {
            System.out.println("关机啦");
        }
    }


    public void nextChannel() {
        if (mState == POW_ON) {
            System.out.println("下一个频道啦");
        } else {
            System.out.println("没有开机");
        }
    }


    //存在问题：  这种写法 每一个方法， 每一种状态下都要做判断，做大量的 if else ， 代码冗余度高。


}
