package com.sda.exercises.threads;

public class RunnableClass implements Runnable{
    private int value;
    private boolean isActive = true;

    public RunnableClass(int value) {
        this.value = value;
    }

    @Override
    public void run() {
        while(isActive){
        System.out.println("Hello "+this.value);
        try{
            Thread.sleep(5000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        }
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void stopThread(){
        this.isActive = false;
    }
}
