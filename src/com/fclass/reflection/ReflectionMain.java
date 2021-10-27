package com.fclass.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionMain {
    public static void main(String args[]){
//        Class ref = ReflectionPrivate.class;
//        String className = ref.getName();
//        System.out.println(className);
//
//        int classMod = ref.getModifiers();
//        System.out.println(Modifier.isTransient(classMod));
        Class ref = ReflectionPrivate.class;
        String classname = ref.getName();
        int modifier = ref.getModifiers();
        System.out.println(modifier);
        System.out.println(classname);


        Method[] classMethods = ref.getMethods();
        for(Method m: classMethods){

            //Getting the names of the method
            System.out.println(m.getName());

            //Getting Access Modifiers of the methods
            int methodModifier = m.getModifiers();
            System.out.println("Is the method Public :   " + Modifier.isPublic(methodModifier));
            System.out.println("Is the method Private :  "+ Modifier.isPrivate(methodModifier) );

            //Getting return type of the methods
            Class returnType = m.getReturnType();
            System.out.println("The return type is : "+ returnType.getName());
            System.out.println();
        }

    }
}
