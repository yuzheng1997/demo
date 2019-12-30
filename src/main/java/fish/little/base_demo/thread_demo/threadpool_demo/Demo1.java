package fish.little.base_demo.thread_demo.threadpool_demo;

/**
 * @author ：yuzheng
 * @date ：Created in 2019/12/25 14:24
 * @description：
 * @modified By：
 * @version: $
 */
public class Demo1 {
    public static void main(String[] args) {
        ThreadPool threadPool = new ThreadPool();
        for (int i = 0; i < 5; i++) {
            final int j = i;
            Runnable task = new Runnable() {
                @Override
                public void run() {
                    System.out.println("执行任务" + j);
                }
            };
            threadPool.add(task);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
