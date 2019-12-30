package fish.little.base_demo.thread_demo.concurrency_demo;

import lombok.Data;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author ：yuzheng
 * @date ：Created in 2019/12/23 10:46
 * @description：
 * @modified By：
 * @version: $
 */
public class Demo2 {
    public static void main(String[] args) {
        Thread[] addThreads = new Thread[10000];
        Thread[] reduceThreads = new Thread[10000];
        Num num = new Num(10000);
        for(int i = 0; i < 10000; i++) {
            Thread t = new Thread(() -> {
                synchronized (num) {
                    num.addNum();
                }
            });
            t.start();
            reduceThreads[i] = t;
        }
        for(int i = 0; i < 10000; i++) {
            Thread t = new Thread(() -> {
                synchronized (num) {
                    num.reduceNum();
                }
            });
            t.start();
            addThreads[i] = t;
        }
        for (Thread t : addThreads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (Thread t : reduceThreads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(num.getNum());
    }
    @Data
    static class Num {
        int num = 0;
        public Num(int num) {
            this.num = num;
        }
        public void reduceNum() {
            num = num - 1;
        }
        public void addNum() {
            num = num + 1;
        }
    }
}
