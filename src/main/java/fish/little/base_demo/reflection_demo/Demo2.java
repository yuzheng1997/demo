package fish.little.base_demo.reflection_demo;

import java.util.ArrayList;

/**
 * @author ：yuzheng
 * @date ：Created in 2019/12/26 16:10
 * @description：
 * @modified By：
 * @version: $
 */
public class Demo2 {
    public static void main(String[] args) throws InterruptedException {
        Base2 b = new Base2("lisi", "24", "girl");
        ArrayList<Thread> arrayList = new ArrayList<>();
        for (int i =0; i < 5; i++) {
            Thread thread = new Thread(() -> {
                synchronized (b) {
                    System.out.println(b);
                    b.getGen();
                }
            });
            arrayList.add(thread);
            thread.start();
        }
        for (int i =0; i < 5; i++) {
            Thread thread = new Thread(() -> {
                b.getGen();
            });
            arrayList.add(thread);
            thread.start();
        }
        for (Thread thread : arrayList) {
            thread.join();
        }
    }
}
