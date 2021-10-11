package com.fclass.multithreading;
class Name implements Runnable{


    public void run(){
        for(int i=0 ; i<5 ; i++){
            System.out.println("raffay");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }

        }
    }

}


class Age implements Runnable {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("24");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }

        }
    }
}
    public class MultiThread {

        public static void main(String[] args) {

            Runnable obj1 = new Name();
            Runnable obj2 = new Age();

            Thread t1 = new Thread(obj1, "name - thread");
            Thread t2 = new Thread(obj2, "Age - thread");

            t1.start();
            try{Thread.sleep(10);}catch(Exception e){
                System.out.println("something wrong");
            }
            t2.start();


            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("both thread are done");


        }
    }

