package me.whiteship.refactoring._04_long_parameter_list._14_replace_parameter_with_query;

public class Order {

    private int quantity;

    private double itemPrice;

    public Order(int quantity, double itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    public double finalPrice() {
        double basePrice = this.quantity * this.itemPrice;
        // 수정 3 필요없는 기능 제거
//        int discountLevel = discountLevel();
        return this.discountedPrice(basePrice);
    }

    // 수정 1 메서드로 뽑아내기
    private int discountLevel() {
        return this.quantity > 100 ? 2 : 1;
    }

    // 수정 2 필요없는 파라미터 제거
    private double discountedPrice(double basePrice) {
        return discountLevel() == 2 ? basePrice * 0.90 : basePrice * 0.95;
    }
}
