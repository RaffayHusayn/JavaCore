package com.fclass.enums;

enum Day{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY;
}
public class EnumDemo {
    public static void main(String[] args){
        Day day = Day.MONDAY;
        System.out.println(day);
    }
}
