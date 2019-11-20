package com.example.designmode.ImageThrid;

import android.graphics.Bitmap;

/**
 * creation date: 2019-11-19 16:17
 * description ：设计模式的开闭原则， 使得程序易于扩展，对拓展设计是开放的，对修改是封闭的。
 * 建立ImageCache 就是让当前的ImageLoader 依赖抽象而不是依赖具体的类
 */

public interface ImageCache {
    void  put(String url, Bitmap bitmap);
    Bitmap get(String url);

}
