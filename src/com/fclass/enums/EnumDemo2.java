package com.fclass.enums;

enum Flavor{
    CHOCOLATE,
    VANILLA,
    STRAWBERRY;
}
public class EnumDemo2 {
    public static void main(String[] args ){
        //getting a value using kind of a key
        String icecream = Flavor.valueOf("CHOCOLATE").toString();
        System.out.println(icecream);


        // getting all the values from the Enum
        Flavor flavorArray[] = Flavor.values();
        for(Flavor f : flavorArray){
            System.out.println(f);
        }
    }
}
