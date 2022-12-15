package me.whiteship.refactoring._20_large_class._41_extract_superclass;

public class Employee extends Party {

    private Integer id;

    private double monthlyCost;

    public Employee(String name) {
        super(name);
    }
//    public double annualCost() {
//        return this.monthlyCost * 12;
//    }

    public Integer getId() {
        return id;
    }

//    public String getName() {
//        return name;
//    }

    @Override
    public double monthlyCost() {
        return monthlyCost;
    }
}
