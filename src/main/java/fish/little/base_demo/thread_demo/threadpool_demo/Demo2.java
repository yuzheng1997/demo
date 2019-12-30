package fish.little.base_demo.thread_demo.threadpool_demo;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author ：yuzheng
 * @date ：Created in 2019/12/25 14:40
 * @description：
 * @modified By：
 * @version: $
 */
public class Demo2 {
    public static void main(String[] args) {
        /**
         * 参数意义
         * 初始化大小
         * 最大线程数
         * 收回时间
         * 单位
         * 集合
         */
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(10,
                15,
                60,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<Runnable>());
        poolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("1111121");
            }
        });
    }


}
