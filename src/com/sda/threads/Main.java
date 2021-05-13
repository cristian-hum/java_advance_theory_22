package com.sda.threads;

public class Main {
    public static void main(String[] args) {

        try {
            StopWatchThread stopWatchThread = new StopWatchThread("Thread 1");
            stopWatchThread.start();

            Thread.sleep(1000);

            StopWatchThread stopWatchThread2 = new StopWatchThread("Thread 2");
            stopWatchThread2.start();

//        System.out.println("Main thread starts");
//        Thread.sleep(5000);
//        System.out.println("Main thread is still running");
//        Thread.sleep(5000);
//        System.out.println("Main thread ends");
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
