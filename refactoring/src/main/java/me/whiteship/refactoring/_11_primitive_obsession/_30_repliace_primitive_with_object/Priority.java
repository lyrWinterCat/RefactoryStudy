package me.whiteship.refactoring._11_primitive_obsession._30_repliace_primitive_with_object;

import java.util.List;

//기본형 객체 만들기
public class Priority {

    private String value;

    //Type Safety 설정
    private List<String> legalValues = List.of("low","normal","high","rush");

    public Priority(String value) {
        if(legalValues.contains(value)){
            this.value = value;
        }else{
            throw new IllegalArgumentException("illegal value for priority "+value);
        }
    }

    @Override
    public String toString() {
        return this.value;
    }

    private int index(){
        return legalValues.indexOf(this.value);
    }

    public boolean highterThen(Priority other){
        return this.index() > other.index();
    }



}
