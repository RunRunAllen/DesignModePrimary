package com.example.designmode.ImageThrid;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * creation date: 2019-11-19 16:31
 * description ： 里氏替换原则
 */
public class DiskCache implements ImageCache {

    private String cacheDir = "";
    private FileOutputStream fileOutputStream;
    private Bitmap bitmap;
    private FileInputStream fileInputStream;

    @Override
    public void put(String url, Bitmap bitmap) {
        try {
            fileOutputStream = new FileOutputStream(cacheDir + url);
            bitmap.compress(Bitmap.CompressFormat.PNG, 80, fileOutputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            CloseableUtils.closed(fileOutputStream);
        }


    }

    @Override
    public Bitmap get(String url) {
        try {
            fileInputStream = new FileInputStream(cacheDir + url);
            bitmap = BitmapFactory.decodeStream(fileInputStream);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            CloseableUtils.closed(fileInputStream);

        }
        return bitmap;
    }
}
