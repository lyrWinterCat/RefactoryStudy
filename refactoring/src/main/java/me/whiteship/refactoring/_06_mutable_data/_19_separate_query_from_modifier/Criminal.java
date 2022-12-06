package me.whiteship.refactoring._06_mutable_data._19_separate_query_from_modifier;

import java.util.List;

public class Criminal {

    // 조회 - 알람 분리

    //알람
    public void alertForMiscreant(List<Person> people) {
        //반복되는 for문 리펙토링
//        if(findMiscreant(people) != "")
        if(!findMiscreant(people).isBlank())
            setOffAlarms();
//        for (Person p : people) {
//            if (p.getName().equals("Don")) {
//               setOffAlarms();
//            }
//
//            if (p.getName().equals("John")) {
//                setOffAlarms();
//            }
//        }
    }

    //조회
    public String findMiscreant(List<Person> people) {
        for (Person p : people) {
            if (p.getName().equals("Don")) {
                return "Don";
            }

            if (p.getName().equals("John")) {
                return "John";
            }
        }

        return "";
    }

    private void setOffAlarms() {
        System.out.println("set off alarm");
    }
}
