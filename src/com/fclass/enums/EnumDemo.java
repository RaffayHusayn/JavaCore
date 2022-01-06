package com.fclass.enums;
class Person{
    String name;
    int age;

    public Person(String name, int age){
        System.out.println("Person Constructor called");
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

enum Day{
    MONDAY("not monday"),
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY;

    // Creating a field in Enum
    String favDay;
    private static Person person;

    // Default Constructor that will be called with all enums if Argument constructor isn't specifically mentioned
    Day(){
        System.out.println("No argument enum constructor");
        this.favDay = "Sunday";
    }
    //Argument constructor that will be called with enums that are called with Arguments like MONDAY
    Day(String favDay){
        System.out.println("One argument enum constructor called");
        this.favDay = favDay;
    }

    public Person person(){
        if(person == null){
            System.out.println("person is null");
            Person intermediatePerson = new Person("raffay", 24);
            this.person = intermediatePerson;
        }
        return person;
    }

}
public class EnumDemo {
    public static void main(String[] args){
        System.out.println("------------------ first time------------------------");
        Person raffay = Day.MONDAY.person();
        System.out.println(raffay);

        System.out.println("------------------second time------------------------");
        Person ayesha = Day.TUESDAY.person();
        System.out.println(ayesha);
    }
}
