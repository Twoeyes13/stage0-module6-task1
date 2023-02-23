package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String aNo = this.hasFur ? "a" : "no";
        String paws = this.numberOfPaws < 2 ? "paw" : "paws";
        return "This animal is mostly " + this.color + ". It has " + this.numberOfPaws + " "+ paws + " and " + aNo + " fur.";
        //"This animal is mostly (color). It has (numberOfPaws) paws and ('a'/'no' -> depends on value of hasFur) fur."
    }
}
