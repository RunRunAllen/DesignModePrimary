package com.example.designmode.singleton;

/**
 * creation date: 2019-12-24 16:42
 * description ：
 */
public class SingleTon {

//    //懒汉  每次调用 getInstance 都会同步
//    private static SingleTon instance;
//
//    private SingleTon() {
//    }
//
//    public static synchronized SingleTon getInstance() {
//        if (instance == null) {
//            instance = new SingleTon();
//        }
//        return instance;
//
//    }


// DCL 问题： 双重检查锁定失效
//    private static SingleTon instance=null;
//
//    private SingleTon() {
//    }
//
//    public static SingleTon getInstance() {
//        if (instance == null) {
//            synchronized (SingleTon.class) {
//                if (instance == null) {
//                    instance = new SingleTon();
//                }
//            }
//        }
//        return instance;
//    }




    //当第一次加载时，不会初始化，调用getInstance 才会实力化，
    private static SingleTon instance;

    private SingleTon() {
    }

    private static class SingleHolder {
        private static final SingleTon instance = new SingleTon();
    }

    public SingleTon getInstance() {
        return SingleHolder.instance;
    }
}
