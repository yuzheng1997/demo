package fish.little.base_demo.thread_demo.concurrency_demo;

import lombok.Data;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author ：yuzheng
 * @date ：Created in 2019/12/25 14:49
 * @description：
 * @modified By：
 * @version: $
 */
public class Demo4 {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Thread[] addThreads = new Thread[10000];
        Thread[] reduceThreads = new Thread[10000];
        Demo1.Num num = new Demo1.Num(10000);
        for(int i = 0; i < 10000; i++) {
            Thread t = new Thread(() -> {
                lock.lock();
                num.reduceNum();
                lock.unlock();
            });
            t.start();
            reduceThreads[i] = t;
        }
        for(int i = 0; i < 10000; i++) {
            Thread t = new Thread(() -> {
                lock.lock();
                num.addNum();
                lock.unlock();
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
