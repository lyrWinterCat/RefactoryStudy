package me.whiteship.refactoring._06_mutable_data._23_change_reference_to_value;

import java.util.Objects;

public class TelephoneNumber {

    private final String areaCode;

    private final String number;

    public TelephoneNumber(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public String number() {
        return number;
    }

    public String areaCode() {
        return areaCode;
    }

// setter 삭제
    //    public void areaCode(String areaCode) {
//        this.areaCode = areaCode;
//    }

//    public void number(String number) {
//        this.number = number;
//    }

// equals 와 hashcode 만들어주기
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TelephoneNumber that = (TelephoneNumber) o;
        return Objects.equals(areaCode, that.areaCode) && Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaCode, number);
    }

    //getter를 만들 때 inteliJ default가 아닌 records style로 한다면 get이 붙은 변수명이 아닌 원래의 변수명 그대로 만들어진다!
}
