package me.whiteship.refactoring._10_data_clumps;

public class TelephoneNumber {

    private String areaCode;

    private String personalNumber;

    public TelephoneNumber(String areaCode, String personalNumber) {
        this.areaCode = areaCode;
        this.personalNumber = personalNumber;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    @Override
    public String toString() {
        return this.areaCode + "-" + this.personalNumber;
    }
}
