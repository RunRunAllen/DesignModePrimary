package com.example.designmode.getCoupon;

/**
 * creation date: 2019-11-22 16:13
 * description ：
 */
public class CouponConfig {
    private String couponType;
    private boolean isCoupon;
    private boolean isLeavePhone;

    public CouponConfig(CouponConfigBuilder builder) {
        this.couponType = builder.couponType;
        this.isCoupon = builder.isCoupon;
        this.isLeavePhone = builder.isLeavePhone;
    }

    public static class CouponConfigBuilder {
        private String couponType;
        private boolean isCoupon;
        private boolean isLeavePhone;

        public CouponConfigBuilder(String couponType) {
            this.couponType = couponType;
        }


        public CouponConfigBuilder isCoupon(boolean isCoupon) {
            this.isCoupon = isCoupon;
            return this;
        }

        public CouponConfigBuilder isLeavePhone(boolean isLeavePhone) {
            this.isLeavePhone = isLeavePhone;
            return this;
        }

//        public CouponConfigBuilder setCouponType(String type) {
//            this.couponType = type;
//            return this;
//        }


        public CouponConfig build() {
            return new CouponConfig(this);
        }

    }

}
