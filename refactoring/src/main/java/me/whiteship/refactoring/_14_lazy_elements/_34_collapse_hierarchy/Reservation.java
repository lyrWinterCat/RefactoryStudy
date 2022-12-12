package me.whiteship.refactoring._14_lazy_elements._34_collapse_hierarchy;

import java.time.LocalDateTime;
import java.util.List;

public class Reservation {

    //refactor - pull/push members up/down 기능 사용
    // 그렇게 자주 발생하는 리팩토링은 아니지만, 참고

    private LocalDateTime startDateTime;

    private LocalDateTime endDateTime;

    private List<String> members;

    private String owner;

    private boolean paid;

    private String courtNumber;
}
