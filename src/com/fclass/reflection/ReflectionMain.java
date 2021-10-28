package com.fclass.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.sql.Ref;
import java.sql.SQLOutput;

public class ReflectionMain {
    public static void main(String args[]) {
        //Getting class name and access modifier
        System.out.println("________________Class name and Access Modifier___________________");
        Class ref = ReflectionPrivate.class;
        String classname = ref.getName();
        int modifier = ref.getModifiers();
        System.out.println(modifier);
        System.out.println(classname);

        //Doing stuff with Methods of the class
        System.out.println();
        System.out.println("___________________Methods of the Class___________________________");
        Method[] classMethods = ref.getMethods();
        for (Method m : classMethods) {

            //Getting the names of the method
            System.out.println(m.getName());

            //Getting Access Modifiers of the methods
            int methodModifier = m.getModifiers();
            System.out.println("Is the method Public :   " + Modifier.isPublic(methodModifier));
            System.out.println("Is the method Private :  " + Modifier.isPrivate(methodModifier));

            //Getting return type of the methods
            Class returnType = m.getReturnType();
            System.out.println("The return type is : " + returnType.getName());

            //Getting Parameter of the methods
            Class[] params = m.getParameterTypes();
            for (Class p : params) {
                System.out.println("the param name is : " + p.getName() + "--> " + p.getSimpleName());
            }
            System.out.println();
            System.out.println();

        }

        //Object Creation with default constructor and param constructor
        System.out.println("___________________________Object Creation___________________________");
        try {
            Constructor<ReflectionPrivate> cons = ReflectionPrivate.class.getConstructor(String.class, int.class);
            ReflectionPrivate obj = cons.newInstance("raff", 12312);


            Class c = Class.forName("com.fclass.reflection.ReflectionPrivate");
            ReflectionPrivate obj1 = (ReflectionPrivate) c.getDeclaredConstructor().newInstance();
            Method m1 = c.getDeclaredMethod("toString", null);
            m1.setAccessible(true);
            m1.invoke(obj1, null);
        } catch (Exception e) {
            System.out.println("something wrong : " + e);
        }
    }
}
