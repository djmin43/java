package org.example.more.quiz;

import java.util.ArrayList;

class HeavyWork implements Runnable {
    String name;

    HeavyWork(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        work();
    }

    public void work() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100);  // 0.1 초 대기한다.
            } catch (Exception e) {
            }
        }
        System.out.printf("%s done.\n", this.name);
    }
}

public class Sample {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            Thread thread = new Thread(new HeavyWork("w" + i));
            threads.add(thread);
            thread.start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        long end = System.currentTimeMillis();
        System.out.printf("elapsed time:%s ms\n", end - start);
    }
}