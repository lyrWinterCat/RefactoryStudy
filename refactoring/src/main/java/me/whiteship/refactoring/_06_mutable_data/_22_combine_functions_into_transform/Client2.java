package me.whiteship.refactoring._06_mutable_data._22_combine_functions_into_transform;

public class Client2 extends ReadingClient{

    private double base;
    private double taxableCharge;

    public Client2(Reading reading) {
        EnrichReading enrichReading = enrichReading(reading);

//        this.base = baseRate(reading.month(), reading.year()) * reading.quantity();
        this.base = enrichReading.baseCharge();
//        this.taxableCharge = Math.max(0, this.base - taxThreshold(reading.year()));
        this.taxableCharge =enrichReading.taxableCharge();
    }

//    private double taxThreshold(Year year) {
//        return 5;
//    }

//    private double baseRate(Month month, Year year) {
//        return 10;
//    }

    public double getBase() {
        return base;
    }

    public double getTaxableCharge() {
        return taxableCharge;
    }
}
