package com.fclass.reflection;

public class ReflectionPrivate {
    private int number = 12;
    private String name = "raffay";

    public String toString(){
        System.out.println("to string : " + this.name + " " + this.number);
      return this.name + " " + this.number;
    }
    public  void printMessage(String msg){
        System.out.println(msg);
    }

    private  void privatePrintMessage(String msg){
        System.out.println(msg);
    }

    public ReflectionPrivate(){
        System.out.println("object created without params");
    }
    public ReflectionPrivate(String uname, int passcode){
        this.number = passcode;
        this.name = uname;
        System.out.println("Object is created with "+ uname + "  "+ passcode);

    }
}
