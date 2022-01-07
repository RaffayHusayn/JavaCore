package com.fclass.booleanParsing;

import java.util.ArrayList;
import java.util.List;

public class BooleanParsing {
    public static void main(String[] args){
        List<Boolean> list = new ArrayList<>();
        list.add(true);
        list.add(Boolean.parseBoolean("FaLSe")); //returns false in everycase unless the String is "true" (disregarding the upper/lower case)
        list.add(false);
        System.out.println(list.size());//should return 3 because length is 3
        System.out.println(list.get(1)); //should return false because [true, false, false]
        System.out.println(list.get(1) instanceof Boolean);//should return true because all of them are Boolean
    }
}
