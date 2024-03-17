package org.multithreading;

public class Hi extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
                System.out.println("Hi");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
