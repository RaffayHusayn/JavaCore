package com.fclass.multithreading;
class NamePrint implements Runnable{
    private String name;
    public void setClassName(String name ){
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println("Name thread is running");
        for(int i = 0 ; i< 5 ; i++ ){
            System.out.println("the name is  : "+ name);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class AgePrint implements Runnable{
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void run(){
        System.out.print("Age thread is running now.......");
        for(int i = 0 ; i < 5 ; i++ ){
            System.out.println("the age is  : "+ age);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class MultiThreadDemo {
   public static void main(String[] args) throws InterruptedException {
      NamePrint nameClass = new NamePrint();
      AgePrint ageClass = new AgePrint();
      nameClass.setClassName("raffay");
      ageClass.setAge(24);
      Thread t1 = new Thread(nameClass);
      Thread t2 = new Thread(ageClass);
      t1.start();
      Thread.sleep(1);
      t2.start();

      t1.join();
      t2.join();
       System.out.println("both threads are done");
   }
}
