package com.kadir.person;

public enum Sex {

    Mr(1), Ms(2);

    int value;

    Sex(int sexType) {
        this.value = sexType;
    }

    public int getValue() {
        return value;
    }
}
