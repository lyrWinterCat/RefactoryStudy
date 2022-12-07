package me.whiteship.refactoring._07_divergent_change._25_move_function;

public class AccountType {
    private boolean premium;

    public AccountType(boolean premium) {
        this.premium = premium;
    }

    public boolean isPremium() {
        return this.premium;
    }

    // overdraftCharge에서 Account를 넘기는 것이 맞는가? 강의는 데이터가 많을 경우 Account를 넘기는 것이 타당하다고 보나 (책)
    // 이번 경우에는 int daysOverdrawn 값만 넘기는 것이 타당하다고 선택.
    public double overdraftCharge(int daysOverdrawn) {
        if (this.isPremium()) {
            final int baseCharge = 10;
            if (daysOverdrawn <= 7) {
                return baseCharge;
            } else {
                return baseCharge + (daysOverdrawn - 7) * 0.85;
            }
        } else {
            return daysOverdrawn * 1.75;
        }
    }
}
