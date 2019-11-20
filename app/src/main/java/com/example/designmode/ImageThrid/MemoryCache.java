package com.example.designmode.ImageThrid;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * creation date: 2019-11-19 16:28
 * description ：
 */
public class MemoryCache implements ImageCache {

    final int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);
    final int cacheSize = maxMemory / 4;

    private LruCache<String, Bitmap> mImageCache = new LruCache<String, Bitmap>(cacheSize) {
        @Override
        protected int sizeOf(String key, Bitmap value) {
            return value.getRowBytes() * value.getHeight() / 1024;
        }
    };

    public MemoryCache() {
    }


    @Override
    public void put(String url, Bitmap bitmap) {
        mImageCache.put(url, bitmap);

    }

    @Override
    public Bitmap get(String url) {
        return mImageCache.get(url);
    }

}
