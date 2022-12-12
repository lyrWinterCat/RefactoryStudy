package me.whiteship.refactoring._09_feature_envy;

public class Bill {

    private ElectricityUsage electricityUsage;

    private GasUsage gasUsage;

    public double calculateBill() {
        return electricityUsage.getElecticityBill() + gasUsage.getGasBill();
    }
    
    // 기존의 가스량 계산, 전기량 계산 메서드를 그에 맞는 클래스로 옮겨줌
}
