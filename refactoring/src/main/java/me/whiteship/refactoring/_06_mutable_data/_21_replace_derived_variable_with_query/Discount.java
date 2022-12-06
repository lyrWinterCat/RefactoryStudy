package me.whiteship.refactoring._06_mutable_data._21_replace_derived_variable_with_query;

public class Discount {

//    private double discountedTotal; >>삭제
    private double discount;

    private double baseTotal;

    public Discount(double baseTotal) {
        this.baseTotal = baseTotal;
    }

    public double getDiscountedTotal() {
//        assert this.discountedTotal == this.baseTotal-this.discount; >> 이 부분을 메서드로 빼서 결과를 리턴할 수도 있음.
//        return this.discountedTotal;
        return this.baseTotal - this.discount;
    }

    public void setDiscount(double number) {
        this.discount = number;
//        this.discountedTotal = this.baseTotal - this.discount; >> 삭제
    }

    // 계산해서 나온 값은 대체할 수 있다. 내가 잘 못하는 부분분
}
