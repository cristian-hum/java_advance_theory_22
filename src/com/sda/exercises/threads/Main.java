package com.sda.exercises.threads;


public class Main {
    public static void main(String[] args) {
        RunnableClass runnableClass = new RunnableClass(64);
        //atunci cand implementezi clasa runnable, pentru a porni un thread
        //avem nevoie de un obiect din clasa THread
        Thread thread = new Thread(runnableClass);
        thread.start();

        new Thread(runnableClass).start();


        RunnableClass runnableClass1 = new RunnableClass(15);
        Thread thread1 = new Thread(runnableClass1);
        thread1.start();

        RunnableClass runnableClass2 = new RunnableClass(2);
        Thread thread2 = new Thread(runnableClass2);
        thread2.start();

        RunnableClass runnableClass3 = new RunnableClass(99);
        Thread thread3 = new Thread(runnableClass3);
        thread3.start();

        try {
        Thread.sleep(1000*20);
            runnableClass.stopThread();
            runnableClass1.stopThread();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
