package com.fclass.multithreading;
class NameThread implements Runnable{
    String name;
    public NameThread(String name){
        this.name = name;
    }
    @Override
    public void run() {
        for(int i =0 ; i<5 ; i++) {
            System.out.println("name is : " + name);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class AgeThread implements Runnable{
    int age;
    public AgeThread(int age){
        this.age = age;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("name is : " + age);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadWithParams {

    public static void main(String[] args) throws InterruptedException {
       Runnable o1 = new NameThread("Raffay");
       Runnable o2 = new AgeThread(24);

       Thread t1 = new Thread(o1, "Name-Thread");
       Thread t2 = new Thread(o2, "Age-Thread");

       t1.start();
       Thread.sleep(10);
       t2.start();


       t1.join();
       t2.join();
        System.out.println("Both threads are done runnning");
    }
}
