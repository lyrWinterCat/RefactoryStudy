package me.whiteship.refactoring._08_shotgun_surgery._29_inline_class;

public class Shipment {

//    private TrackingInformation trackingInformation;

    // 1. 필드 이동
    private String shippingCompany;

    private String trackingNumber;

//    public Shipment(TrackingInformation trackingInformation) {
//        this.trackingInformation = trackingInformation;
//    }

    // 2. 필드에 해당하는 생성자 생성
    public Shipment(String shippingCompany, String trackingNumber) {
        this.shippingCompany = shippingCompany;
        this.trackingNumber = trackingNumber;
    }

//    public TrackingInformation getTrackingInformation() {
//        return trackingInformation;
//    }
//
//    public void setTrackingInformation(TrackingInformation trackingInformation) {
//        this.trackingInformation = trackingInformation;
//    }

    public String getTrackingInfo() {
        return this.shippingCompany + ": " + this.trackingNumber;
    }

    // 3. 메서드 이동
    public String getShippingCompany() {
        return shippingCompany;
    }

    public void setShippingCompany(String shippingCompany) {
        this.shippingCompany = shippingCompany;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

}
