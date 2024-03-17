package org.multithreading;

public class UsingLambda {
    public static void main(String[] args) {
        Runnable r1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hi "+Thread.currentThread().getPriority());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

//        Runnable r2 = () -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("Hello");
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello "+Thread.currentThread().getPriority());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "Hello Thread");

        t1.setName("Hi Thead");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}
