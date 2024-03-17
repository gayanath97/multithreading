package org.multithreading;

public class MyRunnable{

    public static void main(String[] args) {
        Silva obj1 = new Silva();
        Gayanath obj2 = new Gayanath();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
