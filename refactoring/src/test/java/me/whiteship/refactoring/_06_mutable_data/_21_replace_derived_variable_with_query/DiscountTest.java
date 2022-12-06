package me.whiteship.refactoring._06_mutable_data._21_replace_derived_variable_with_query;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountTest {

    @Test
    void discount() {
        Discount discount = new Discount(100);
//        assertEquals(100, discount.getDiscountedTotal()); >> setDiscount를 하지 않으면 확인할 수 없음. 0 출력

        discount.setDiscount(10);
        assertEquals(90, discount.getDiscountedTotal());
    }

}