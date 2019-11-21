package com.example.designmode.imageThrid;

/**
 * creation date: 2019-11-20 17:51
 * description ：
 */
public class ImageLoadConfig {

    private String ImageFailId;
    private String ImageSuccessId;
    private int ThreadCount;

    public ImageCache getImageCache() {
        return mImageCache;
    }

    private ImageCache mImageCache;


    private ImageLoadConfig(ImageLoadConfigBuilder imageLoadConfigBuilder) {
        this.ImageFailId = imageLoadConfigBuilder.ImageFailId;
        this.ImageSuccessId = imageLoadConfigBuilder.ImageSuccessId;
        this.ThreadCount = imageLoadConfigBuilder.ThreadCount;
        this.mImageCache = imageLoadConfigBuilder.mImageCache;
    }

    public static class ImageLoadConfigBuilder {
        private String ImageFailId;
        private String ImageSuccessId;
        private int ThreadCount;
        private ImageCache mImageCache = new MemoryCache();


        //通过依赖注入
        public ImageLoadConfigBuilder setImageCache(ImageCache mImageCache) {
            this.mImageCache = mImageCache;
            return this;
        }

        public ImageLoadConfigBuilder ImageFailId(String imageFailId) {
            this.ImageFailId = imageFailId;
            return this;
        }

        public ImageLoadConfigBuilder ImageSuccessId(String imageSuccessId) {
            this.ImageSuccessId = imageSuccessId;
            return this;
        }


        public ImageLoadConfigBuilder ThreadCount(int threadCount) {
            this.ThreadCount = threadCount;
            return this;
        }

        public ImageLoadConfig build() {
            return new ImageLoadConfig(this);
        }
    }
}
