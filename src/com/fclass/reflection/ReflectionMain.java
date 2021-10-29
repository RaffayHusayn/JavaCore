package com.fclass.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

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
        Method[] classMethods = ref.getDeclaredMethods(); //use ref.getMethod() to get all the public method + methods inherited from base class
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
            //CREATING AN OBJECT USING newInstance() method of Constructor class
            Constructor<ReflectionPrivate> cons = ReflectionPrivate.class.getConstructor();
            ReflectionPrivate obj = cons.newInstance();


            //do this or what's done, both are the same
            //Constructor<ReflectionPrivate> consWithParam = ReflectionPrivate.class.getConstructor(String.class,int.class);
            //ReflectionPrivate objWithParam = consWithParam.newInstance("some" , 12123);
            Constructor consWithParam = ReflectionPrivate.class.getConstructor(String.class, int.class);
            ReflectionPrivate objWithParam =(ReflectionPrivate) consWithParam.newInstance("rax", 12);
            System.out.println("classname: " + obj.getClass().getName());
            System.out.println("classname: " + objWithParam.getClass().getName());


            //CREATING AN OBJECT USING newInstance() method of Class class
            Class c =Class.forName("com.fclass.reflection.ReflectionPrivate");
            Object o1 = c.newInstance();
            System.out.println("classname: "+ o1.getClass().getName());
            Method m1 = c.getDeclaredMethod("printMessage", String.class);
            m1.setAccessible(true);
            m1.invoke(o1, "Nabia");


        } catch (Exception e) {
            System.out.println("something wrong : " + e);
        }
    }
}
