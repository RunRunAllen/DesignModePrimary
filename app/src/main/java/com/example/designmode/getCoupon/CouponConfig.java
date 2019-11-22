package com.example.designmode.getCoupon;

/**
 * creation date: 2019-11-22 16:13
 * description ：
 */
public class CouponConfig {
    private String couponType;
    private boolean isCoupon;
    private boolean isLeavePhone;


    public static class CouponConfigBuilder {
        private String couponType;
        private boolean isCoupon;
        private boolean isLeavePhone;

        public CouponConfigBuilder isCoupon() {
            this.isCoupon = isCoupon;
            return this;
        }
    }
}
