package com.americanas.utils;

public enum GenderCategories {

    MALE("M"),
    FEMALE("F");

    private String value;

    private GenderCategories(String value) {

        this.value = value;
    }

    public String getValue() {

        return value;
    }
}
