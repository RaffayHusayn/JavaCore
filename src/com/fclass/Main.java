package com.fclass;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //1. Streams in List from Collection api
        List<Integer> marks = Arrays.asList(12,3,44,5);
        List<Integer> doubledMarks =  marks.stream().map(i -> i * 2).collect(Collectors.toList());
        System.out.println(doubledMarks);


       //2. Streams in Arrays
        int[] numbers = {2,34,5,6};
        int[] lengths =Arrays.stream(numbers).map(i -> i*2).toArray();
        double[] doubledNum = Arrays.stream(numbers).mapToDouble(i -> i*2).toArray();
        System.out.println(Arrays.toString(doubledNum));


       //3. Streams in List converting to Arrays

    }

}