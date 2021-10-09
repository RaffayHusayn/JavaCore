package com.fclass;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> marks = Arrays.asList(12,3,44,5);
        List<Integer> doubledMarks =  marks.stream().map(i -> i * 2).collect(Collectors.toList());
        System.out.println(doubledMarks);
    }

}