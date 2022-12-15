package me.whiteship.refactoring._18_middle_man._39_replace_superclass_with_delegate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Scroll{ //상속 제거
    //스크롤은 아이템이지 카테고리가 아니다. 따라서 리팩토링

    private LocalDate dateLastCleaned;

    private CategoryItem categoryItem;

    public Scroll(Integer id, String title, List<String> tags, LocalDate dateLastCleaned) {
//        super(id, title, tags);
        this.dateLastCleaned = dateLastCleaned;
        this.categoryItem = new CategoryItem(id, title, tags);
    }

    public long daysSinceLastCleaning(LocalDate targetDate) {
        return this.dateLastCleaned.until(targetDate, ChronoUnit.DAYS);
    }
}
