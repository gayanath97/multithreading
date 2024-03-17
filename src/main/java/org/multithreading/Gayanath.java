package org.multithreading;

public class Gayanath implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
                System.out.println("Gayanath");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
        }
    }
}
