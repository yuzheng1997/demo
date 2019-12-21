package fish.little.base_demo.thread_demo.create_thread;

/**
 * 线程实现方式1，继承Thread类
 * @author ：yuzheng
 * @date ：Created in 2019/12/21 20:34
 * @description：
 * @modified By：
 * @version: $
 */
public class demo1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread1 thread = new Thread1("thread" + i);
            thread.start();
        }
    }
    static class Thread1 extends Thread {
        public Thread1(String name) {
            this.setName(name);
        }
        @Override
        public void run() {
            System.out.println(this.getName());
        }
    }
}
