package me.whiteship.refactoring._06_mutable_data._23_change_reference_to_value;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelephoneNumberTest {


    // equals를 구현하지 않았다면 이 테스트는 실패할 것.
    // hash는 equals를 구현하면서 반드시 같이 가야 할 메서드 !
    @Test
    void testEquals(){
        TelephoneNumber number1 = new TelephoneNumber("123","1234");
        TelephoneNumber number2 = new TelephoneNumber("123","1234");
        assertEquals(number1,number2);
    }

    @Test
    void testEqualsTelephoneNumberRecord(){
        TelephoneNumberRecord number1 = new TelephoneNumberRecord("123","1234");
        TelephoneNumberRecord number2 = new TelephoneNumberRecord("123","1234");
        assertEquals(number1,number2);
    }

}