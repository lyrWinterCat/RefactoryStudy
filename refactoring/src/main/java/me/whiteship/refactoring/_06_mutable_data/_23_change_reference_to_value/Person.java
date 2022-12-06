package me.whiteship.refactoring._06_mutable_data._23_change_reference_to_value;

public class Person {

//    private TelephoneNumber officeTelephoneNumber;
    private TelephoneNumberRecord officeTelephoneNumber;

    public String officeAreaCode() {
        return this.officeTelephoneNumber.areaCode();
    }

    public void officeAreaCode(String areaCode) {
//        this.officeTelephoneNumber = new TelephoneNumber(areaCode, this.officeNumber());
        this.officeTelephoneNumber = new TelephoneNumberRecord(areaCode, this.officeNumber());
    }

    public String officeNumber() {
        return this.officeTelephoneNumber.number();
    }

    public void officeNumber(String number) {
//        this.officeTelephoneNumber = new TelephoneNumber(this.officeAreaCode(), number);
        this.officeTelephoneNumber = new TelephoneNumberRecord(this.officeAreaCode(), number);
    }

}
