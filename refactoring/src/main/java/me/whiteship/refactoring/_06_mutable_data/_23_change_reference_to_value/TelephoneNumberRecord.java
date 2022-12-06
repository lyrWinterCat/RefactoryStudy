package me.whiteship.refactoring._06_mutable_data._23_change_reference_to_value;

public record TelephoneNumberRecord(String areaCode, String number) {
    //record를 쓴다면 앞의 TelephoneNumber 클래스 안의 내용물이 필요 없음 ^^...
}
