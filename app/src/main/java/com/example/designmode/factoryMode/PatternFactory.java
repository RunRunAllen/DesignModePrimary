package com.example.designmode.factoryMode;

/**
 * creation date: 2019-12-26 16:07
 * description ：工厂模式
 */
public abstract class PatternFactory {

    public abstract <T extends CarFunction> T createCar(Class<T> clz);


}
