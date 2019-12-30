package fish.little.base_demo.thread_demo.threadpool_demo;

import java.util.LinkedList;

/**
 * @author ：yuzheng
 * @date ：Created in 2019/12/25 13:57
 * @description：
 * @modified By：
 * @version: $
 */
public class ThreadPool {
    int initSize;
    LinkedList<Runnable> tasks = new LinkedList<>();
    public ThreadPool() {
        initSize = 10;
        synchronized (tasks) {
            for (int i = 0; i < initSize; i++) {
                new TaskThread("线程" + i).start();
            }
        }
    }
    public void add(Runnable task) {
        synchronized (tasks) {
            tasks.add(task);
            tasks.notifyAll();
        }
    }
    class TaskThread extends Thread {
        public TaskThread (String name) {
            super(name);
        }
        Runnable task;
        @Override
        public void run() {
            System.out.println(this.getName() + "启动了");
            while (true) {
                synchronized (tasks) {
                    while (tasks.isEmpty()) {
                        try {
                            tasks.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    task = tasks.removeLast();
                    tasks.notifyAll();
                }
                System.out.println(this.getName() + "获取到任务");
                task.run();
            }
        }
    }
}
