package me.whiteship.refactoring._12_repeated_swtiches;

public class SwitchImprovements {

    public int vacationHours(String type) {
        int result = switch (type) {
            case "full-time" -> {
                // 여러 값을 줄 때 사용
                // 하나의 값일때 :
                // case "full-time" : yield 120; 이런 식으로 사용
                yield 120;
            }
            case "part-time" -> 80;
            case "temporal" -> 32;
            default -> 0;
        };
        return result;
    }

//    public int vacationHours(String type) {
//        int result;
//        switch (type) {
//            case "full-time": result = 120; break;
//            case "part-time": result = 80; break;
//            case "temporal": result = 32; break;
//            default: result = 0;
//        }
//        return result;
//    }
}
