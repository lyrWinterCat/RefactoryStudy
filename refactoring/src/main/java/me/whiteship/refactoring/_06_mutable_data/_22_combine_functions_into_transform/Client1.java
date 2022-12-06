package me.whiteship.refactoring._06_mutable_data._22_combine_functions_into_transform;

public class Client1 extends ReadingClient{

    double baseCharge;

    public Client1(Reading reading) {
        // 메서드 분리
//        this.baseCharge = baseCharge(reading);
        this.baseCharge = enrichReading(reading).baseCharge();
    }

//    private double baseCharge(Reading reading) {
//        return baseRate(reading.month(), reading.year()) * reading.quantity();
//    }

//    private double baseRate(Month month, Year year) {
//        return 10;
//    }

    public double getBaseCharge() {
        return baseCharge;
    }
}
