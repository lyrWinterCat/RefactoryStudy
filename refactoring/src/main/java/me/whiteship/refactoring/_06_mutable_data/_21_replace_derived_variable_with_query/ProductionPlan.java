package me.whiteship.refactoring._06_mutable_data._21_replace_derived_variable_with_query;

import java.util.ArrayList;
import java.util.List;

public class ProductionPlan {

//    private double production;
    private List<Double> adjustments = new ArrayList<>();

    public void applyAdjustment(double adjustment) {
        this.adjustments.add(adjustment);
//        this.production += adjustment;
    }

    public double getProduction() {
//        assert this.production == calculatedProduction();
//        return this.production;
        return this.adjustments.stream().mapToDouble(Double::valueOf).sum(); //인라인처리
    }

    private double calculatedProduction() {
//        return this.adjustments.stream().reduce(0, (a, b) -> a + b);
        return this.adjustments.stream().mapToDouble(Double::valueOf).sum();
    }
}
