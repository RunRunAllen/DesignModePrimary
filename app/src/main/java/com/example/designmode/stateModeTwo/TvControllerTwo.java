package com.example.designmode.stateModeTwo;

/**
 * creation date: 2019-11-22 17:03
 * description ：
 */
public class TvControllerTwo implements PowerController {
    TvState mtvState;


    private void setState(TvState mtvState) {
        this.mtvState = mtvState;
    }

    @Override
    public void PowerOff() {
        setState(new PowerOff());

    }

    @Override
    public void PowerOn() {
        setState(new PowerOn());
    }
    public  void  nextChanner(){
        mtvState.nextChanner();
    }
}

