package me.whiteship.refactoring._11_primitive_obsession._30_repliace_primitive_with_object;

public class Order {

//    private String priorityValue;

    private Priority priority;

    //type Safety가 보장되지 않음
    //기존 생성자 활용
    public Order(String priorityValue) {
        this(new Priority(priorityValue));
    }

    //이걸 추가하던가 위의 방법을 쓰던가
    public Order(Priority priority){
        this.priority = priority;
    }

    public Priority getPriority() {
        return priority;
    }

    //    public String getPriorityValue() {
//        return priorityValue;
//    }
}
