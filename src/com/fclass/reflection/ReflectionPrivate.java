package com.fclass.reflection;

public class ReflectionPrivate {
    private int number = 12;
    private String name = "raffay";

    public String toString(String n, int no){
      return n + " " + no;
    }
    public  void printMessage(String msg){
        System.out.println(msg);
    }

    public ReflectionPrivate(String uname, int passcode){
        System.out.println("method is called with "+ uname + "  "+ passcode);

    }
}
