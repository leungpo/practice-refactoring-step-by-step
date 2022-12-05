package com.afs.refactoring;

public class Driver {
    private int age;
    private static final int MIN_ADULT_AGE = 18;

    public Driver(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public boolean isAdult(){
        return getAge() >= MIN_ADULT_AGE;
    }
}
