package com.fclass.innerclass;

public class OutterClass {
    public void  printInnerClass(int num){
        System.out.println("Inside the method but outside the inner class");
        class InnerClass{
            public void print(){
                System.out.println("Inside the inner class");
            }

        }

        System.out.println("Crreating the Instance of Inner Class in the method");
        InnerClass iClass = new InnerClass();
        iClass.print();
    }
}
