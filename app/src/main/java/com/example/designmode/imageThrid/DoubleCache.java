package com.example.designmode.imageThrid;

import android.graphics.Bitmap;

/**
 * creation date: 2019-11-19 16:22
 * description ：双缓存机制
 */
public class DoubleCache implements ImageCache {

    MemoryCache memoryCache = new MemoryCache();
    DiskCache diskCache = new DiskCache();

    @Override
    public void put(String url, Bitmap bitmap) {
        memoryCache.put(url, bitmap);
        diskCache.put(url, bitmap);
    }

    @Override
    public Bitmap get(String url) {
        Bitmap bitmap = memoryCache.get(url);
        if (bitmap == null) {
            return diskCache.get(url);
        }
        return bitmap;
    }

}
