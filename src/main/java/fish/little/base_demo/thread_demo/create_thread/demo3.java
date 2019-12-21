package fish.little.base_demo.thread_demo.create_thread;

/**
 * 实现Runnable接口
 * @author ：yuzheng
 * @date ：Created in 2019/12/21 20:44
 * @description：
 * @modified By：
 * @version: $
 */
public class demo3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new Thread1(i)).start();
        }
    }
    static class Thread1 implements Runnable {
        private int i;
        public Thread1(int i) {
            this.i = i;
        }
         @Override
        public void run() {
             System.out.println("thread" + i);
        }
    }
}
