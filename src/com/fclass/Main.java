package com.fclass;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import com.fclass.innerclass.*;

public class Main {

    public static void main(String[] args) {
        OutterClass oclass = new OutterClass();
        oclass.printInnerClass(3);
    }

}