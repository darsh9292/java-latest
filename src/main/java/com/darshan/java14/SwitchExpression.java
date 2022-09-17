package com.darshan.java14;

public class SwitchExpression {

    enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public int before(Day day) {
        int numLetters;
        switch(day) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                numLetters = 6;
                break;
            default:
                throw new RuntimeException("Not valid options");
        }
        return numLetters;
    }

    //have to cover all cases
    public int after(Day day){
        return switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY, WEDNESDAY, THURSDAY, SATURDAY -> 5;
            default -> 10;
        };
    }

    public static void main(String[] args) {
        
    }
}
