package me.whiteship.refactoring._24_comments._43_introduce_assertion;

public class Customer {

    private Double discountRate;

    public double applyDiscount(double amount) {
        return (this.discountRate != null) ? amount - (this.discountRate * amount) : amount;
    }

    public Double getDiscountRate() {
        return discountRate;
    }

    // java 17부터 -ea 에서 enable assertion 옵션으로 자동확인됨
    public void setDiscountRate(Double discountRate) {
        // 주석보다 assert를 사용하는 것이 더 좋음
//        assert discountRate != null && discountRate > 0;
        // assert가 없더라도 코드가 정상작동 하도록 장치를 해 주어야 함
        if (discountRate != null && discountRate > 0) {
            throw new IllegalArgumentException(discountRate + " can't be minus");
        }
        this.discountRate = discountRate;
    }
}
