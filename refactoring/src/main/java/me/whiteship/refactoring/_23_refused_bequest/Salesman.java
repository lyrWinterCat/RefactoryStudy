package me.whiteship.refactoring._23_refused_bequest;

public class Salesman extends Employee {

//refactor - push member down
    protected Quota quota;

    protected Quota getQuota() {
        return new Quota();
    }
}

