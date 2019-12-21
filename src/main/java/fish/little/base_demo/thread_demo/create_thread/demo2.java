package fish.little.base_demo.thread_demo.create_thread;

/**
 * 实现匿名内部类的方式
 * @author ：yuzheng
 * @date ：Created in 2019/12/21 20:38
 * @description：
 * @modified By：
 * @version: $
 */
public class demo2 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            int finalI = i;
            Thread thread = new Thread(() -> System.out.println("thread" + finalI));
            thread.start();
        }
    }
}
