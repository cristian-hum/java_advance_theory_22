package com.sda.threads;

public class StopWatchThread extends Thread {
    private String name;

    public StopWatchThread(String name) {
        this.name = name;
    }

    // In metoda run scrie cum va functiona Threadul nostru
    @Override
    public void run() {
        try {
            for(int i = 10; i > 0; i--) {
                Thread.sleep(1000);
                System.out.println(this.name + " time: " + i);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
