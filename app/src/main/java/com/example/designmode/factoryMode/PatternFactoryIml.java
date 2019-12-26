package com.example.designmode.factoryMode;

/**
 * creation date: 2019-12-26 16:14
 * description ：
 */
public class PatternFactoryIml extends PatternFactory {
    @Override
    public <T extends CarFunction> T createCar(Class<T> clz) {
        CarFunction carFunction = null;
        try {
            carFunction = (CarFunction) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }
}
