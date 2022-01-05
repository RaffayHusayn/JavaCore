package com.fclass.enums;

enum Day{
    MONDAY("not monday"),
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY;

    // Creating a field in Enum
    String favDay;

    // Default Constructor that will be called with all enums if Argument constructor isn't specifically mentioned
    Day(){
        this.favDay = "Sunday";
    }
    //Argument constructor that will be called with enums that are called with Arguments like MONDAY
    Day(String favDay){
        this.favDay = favDay;
    }
}
public class EnumDemo {
    public static void main(String[] args){
    Day day = Day.TUESDAY;
        System.out.println(day.favDay);
    }
}
