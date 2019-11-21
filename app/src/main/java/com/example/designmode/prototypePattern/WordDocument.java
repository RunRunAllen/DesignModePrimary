package com.example.designmode.prototypePattern;

import android.util.Log;

import java.util.ArrayList;

/**
 * creation date: 2019-11-21 11:22
 * description ： 原型模式 ： 需要当前类实现Cloneable 接口， 重写 clone 方法
 */
public class WordDocument implements Cloneable {

    private String text;
    private ArrayList<String> mList = new ArrayList<>();


    @Override
    protected WordDocument clone() {

        WordDocument doc = null;
        try {
            doc = (WordDocument) super.clone();
            doc.text = this.text;
            //doc.mList = this.mList;
            //注： 当对 doc2 进行this.mList时， 会出现原始对象 和clone 对象是同一个对象的原因， 会出现 在clone 对象中添加图片时，
            // 原始对象中也会添加图片， 这里 需要采用深拷贝， 即在拷贝对象时，对于引用型的字段也需要采用拷贝的形式，而不是单纯的引用形式。
            doc.mList = (ArrayList<String>) this.mList.clone();
            return doc;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<String> getList() {
        return mList;
    }

    public void setImage(String image) {
        if (mList != null) {
            mList.add(image);
        }
    }


    public void show() {
        for (int i = 0; i < mList.size(); i++) {
            Log.i("haha", "======="+mList.get(i));
            if(i==mList.size()-1){
                Log.i("haha","=======================");
            }

        }
    }

}
