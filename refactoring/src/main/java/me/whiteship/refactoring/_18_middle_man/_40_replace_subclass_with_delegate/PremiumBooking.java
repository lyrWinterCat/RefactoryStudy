package me.whiteship.refactoring._18_middle_man._40_replace_subclass_with_delegate;

import java.time.LocalDateTime;

// 없어도 됨
public class PremiumBooking extends Booking {

    private PremiumExtra extra;

    public PremiumBooking(Show show, LocalDateTime time, PremiumExtra extra) {
        super(show, time);
        this.extra = extra;
    }

//    @Override
//    public boolean hasTalkback() {
////        return this.show.hasOwnProperty("talkback");
//        return this.premiumDelegate.hasTalkback();
//    }

    // PremiumDelegate 에서 사용
//    @Override
//    public double basePrice() {
//        return Math.round(super.basePrice() + this.extra.getPremiumFee());
//    }

}
