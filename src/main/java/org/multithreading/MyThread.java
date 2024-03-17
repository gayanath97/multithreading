package org.multithreading;

public class MyThread{

    public static void main(String[] args) {
        Hello obj1 = new Hello();
        Hi obj2 = new Hi();
        obj1.start();
        obj2.start();
    }
}


