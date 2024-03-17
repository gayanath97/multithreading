package org.multithreading;

public class Hello extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
                System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
