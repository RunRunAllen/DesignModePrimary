package com.example.designmode.imageSecond;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * creation date: 2019-11-19 16:03
 * description ：
 */
public class ImageCache {


    //图片缓存
    private LruCache<String, Bitmap> mImageCache;

    public ImageCache() {
        initImageCache();
    }

    private void initImageCache() {
        final int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);
        final int cacheSize = maxMemory / 4;

        mImageCache = new LruCache<String, Bitmap>(cacheSize) {
            @Override
            protected int sizeOf(String key, Bitmap value) {
                return value.getRowBytes() * value.getHeight() / 1024;
            }
        };

    }


    public void put(String url, Bitmap bitmap) {
        mImageCache.put(url, bitmap);
    }


    public void get(String url) {
        mImageCache.get(url);
    }


}
