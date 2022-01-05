package com.fclass.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args){


        //1. Stream in List from Collection API
        List<Integer> numList = Arrays.asList(2,3,4,5,1,2);
        List<Integer> numListStream = numList.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println("Original List : " + numList);
        System.out.println("Doubled List : "+ numListStream);


        //2. Stream in Arrays
        int[] numArray = {1,2,4,4,1,2,6};
        int[] numArrayStream = Arrays.stream(numArray).map(i->i*2).toArray();
        System.out.println("\n\n"+ "Original Array : "+ Arrays.toString(numArray));
        System.out.println("Doubled Array : "+ Arrays.toString(numArrayStream));


        //3. Streams in List converting to Arrays
        List<Integer> numList1 = Arrays.asList(2,5,6,8,9);
        int[] numArrayStream1 = numList1.stream().mapToInt(i->i*2).toArray();
        System.out.println("\n\n"+ "Original List that would be converted into Array : " + numList1  );
        System.out.println("Doubled Array after convertion : "+ Arrays.toString(numArrayStream1));


        List<Integer> numList2 = Arrays.asList(2,3,4,1,21,4);
        List<Integer> numListAdd = numList2.stream().map(i->i+2).collect(Collectors.toList());
        System.out.println("==============Stream adding 2==================");
        System.out.println(numList2);
        System.out.println(numListAdd);
    }
}
