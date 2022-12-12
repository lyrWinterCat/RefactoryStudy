package me.whiteship.refactoring._11_primitive_obsession._32_replace_conditional_with_polymorphism.variation;

import java.util.List;

public class ChinaExperiencedVoyageRating extends VoyageRating {

    public ChinaExperiencedVoyageRating(Voyage voyage, List<VoyageHistory> history) {
        super(voyage, history);
    }

    @Override
    protected int captainHistoryRisk() {
        int result = super.captainHistoryRisk() - 2;
        return Math.max(result, 0);
    }

    @Override
    protected int voyageProfitFactor() {
        return super.voyageProfitFactor() + 3;
    }

    @Override
    protected int voyageLengthFactor() {
        int result = 0;
        result += 3;
//        if (this.history.size() > 10) result += 1;
//        result += historyLengthFactor();
        if (this.voyage.length() > 12) result += 1;
        if (this.voyage.length() > 18) result -= 1;
        return result;
    }

    //메서드를 올려줬기 때문에 여기서 호출할 필요 없음
//    @Override
//    protected int historyLengthFactor() {
//        return (this.history.size() > 10) ? 1 : 0;
//    }
}
