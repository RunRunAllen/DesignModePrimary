package com.example.designmode.ImageThrid;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * creation date: 2019-11-19 16:15
 * description ：
 */
public class ImageLoad {

    //通过依赖注入
    public void setImageCache(ImageCache mImageCache) {
        this.mImageCache = mImageCache;
    }

    private ImageCache mImageCache;

    //线程池， 线程数量为cpu的数量
    ExecutorService mExecutorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    Handler mHandler = new Handler(Looper.getMainLooper());

    //展示图片
    public void displayImage(final String url, final ImageView imageView) {

//        imageView.setTag(url);
//        mExecutorService.submit(new Runnable() {
//            @Override
//            public void run() {
//                Bitmap bitmap = downLoadImage(url);
//                if (bitmap == null) return;
//                if (imageView.getTag().equals(url)) {
//                    updateImageView(imageView, bitmap);
//                }
//                mImageCache.put(url, bitmap);
//
//
//            }
//        });

        Bitmap bitmap = mImageCache.get(url);
        if (bitmap != null) {
            updateImageView(imageView, bitmap);
            return;
        }
        submitLoadRequest(url, imageView);

    }

    private void submitLoadRequest(final String url, final ImageView imageView) {
        imageView.setTag(url);
        mExecutorService.submit(new Runnable() {
            @Override
            public void run() {
                Bitmap bitmap = downLoadImage(url);
                if (bitmap == null) return;
                if (imageView.getTag().equals(url)) {
                    updateImageView(imageView, bitmap);
                }
                mImageCache.put(url, bitmap);
            }
        });
    }


    //更新
    private void updateImageView(final ImageView imageView, final Bitmap bitmap) {
        mHandler.post(new Runnable() {
            @Override
            public void run() {
                imageView.setImageBitmap(bitmap);
            }
        });

    }


    public Bitmap downLoadImage(String imageUrl) {
        Bitmap mBitmap = null;
        try {
            URL url = new URL(imageUrl);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            mBitmap = BitmapFactory.decodeStream(urlConnection.getInputStream());
            urlConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mBitmap;
    }

}
