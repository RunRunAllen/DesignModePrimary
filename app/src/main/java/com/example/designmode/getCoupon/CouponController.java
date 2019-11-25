package com.example.designmode.getCoupon;

/**
 * creation date: 2019-11-22 17:20
 * description ：
 */
public class CouponController implements Coupon {

    private CouponConfig config;
    CouponState mCouponState;

    private CouponController() {

    }

    private static class CouponControllerHolder {
        private static final CouponController INSTANCE = new CouponController();
    }

    public static CouponController getInstance() {

        return CouponControllerHolder.INSTANCE;
    }


    public void init(CouponConfig couponConfig) {

        this.config = couponConfig;
    }


    public void setCouponState(CouponState mCouponState) {
        this.mCouponState = mCouponState;
    }


    public void realCoupon() {
        setCouponState(new RealCouponIml());
    }


    public void fakeCoupon() {
        setCouponState(new FakeCouponIml());
    }
}
