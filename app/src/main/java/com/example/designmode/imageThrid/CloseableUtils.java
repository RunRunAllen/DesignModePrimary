package com.example.designmode.imageThrid;

import java.io.Closeable;
import java.io.IOException;

/**
 * creation date: 2019-11-19 18:19
 * description ：采用 接口隔离原则  通过  依赖 Closeable 接口 而非具体实现，
 * 用户只需要知道这个对象是可以关闭的，其他的都不用考虑，达到接口隔离的效果。
 */
public class CloseableUtils {


    public static void closed(Closeable closeable) {
        try {
            if (closeable != null) {
                closeable.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
