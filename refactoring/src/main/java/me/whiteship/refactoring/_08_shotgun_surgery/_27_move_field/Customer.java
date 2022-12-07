package me.whiteship.refactoring._08_shotgun_surgery._27_move_field;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Customer {

    private String name;

    // discountRate 필드 옮기기
//    private double discountRate; //getter setter 캡슐화

    private CustomerContract contract;

    public Customer(String name, double discountRate) {
        this.name = name;
//        this.discountRate = discountRate;
        this.contract = new CustomerContract(dateToday(), discountRate);
    }

    public void setDiscountRate(double discountRate) {
        this.contract.setDiscountRate(discountRate);
    }

    public double getDiscountRate() {
        return this.contract.getDiscountRate();
    }

    public void becomePreferred() {
        this.setDiscountRate(this.getDiscountRate()+0.03);
//        this.discountRate += 0.03;
        // 다른 작업들
    }

    public double applyDiscount(double amount) {
        BigDecimal value = BigDecimal.valueOf(amount);
        return value.subtract(value.multiply(BigDecimal.valueOf(this.getDiscountRate()))).doubleValue();
    }

    private LocalDate dateToday() {
        return LocalDate.now();
    }
}
