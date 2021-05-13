package com.sda.threads;

public class Main {
    public static void main(String[] args) {

        synchronizedThread();

    }

    public static void synchronizedThread() {
        Bench bench = new Bench(1);

        SeatTakerThread seatTakerThread1 = new SeatTakerThread(bench);
        SeatTakerThread seatTakerThread2 = new SeatTakerThread(bench);

        seatTakerThread1.start();
        seatTakerThread2.start();
    }

    public static void explainThreads() {
        try {
//            1 sec - 1000 milisecunde
//            1 minut - 60 * 1000
//            1 ora - 60 * 60 * 1000
//            1 zi - 24 * 60 * 60 * 1000
//            System.out.println("Main thread starts");
//            Thread.sleep(5000);
//            System.out.println("Main thread is still running");
//            Thread.sleep(5000);
//            System.out.println("Main thread ends");

//            StopWatchThread extinde clasa Thread
            StopWatchThread stopWatchThread = new StopWatchThread("Thread 1");
            // metoda start() este disponibila doar daca extindem clasa thread
            stopWatchThread.start();

//            punem pe pauza un Thread pentru 5 secunde
            Thread.sleep(5000);


            // daca implementam interfata Runnable, trebuie sa avem un obiect de
            // tipul Thread, iar in constructorul clasei Thread trimtem obiectul care
            // implementeaza interfata Runnable
            // apoi apelam start()
            StopWatchThreadInterface stopWatchThread2 = new StopWatchThreadInterface("Thread Interface");

            // avem un obiect de tipul Thread
            Thread thread = new Thread(stopWatchThread2);
            thread.start();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
