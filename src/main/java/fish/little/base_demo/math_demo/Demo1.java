package fish.little.base_demo.math_demo;

import java.util.Map;
import java.util.Random;

/**
 * math常用方法
 * abs 绝对值，sqrt平方根
 * @author ：yuzheng
 * @date ：Created in 2019/12/9 10:46
 * @description：
 * @modified By：
 * @version: $
 */
public class Demo1 {
    public static void main(String[] args) {
        double num = 20d;
        double num2 = 30d;
        double num3 = 20.5;
        // 获取大的
        System.out.println(Math.max(num, num2));
        // 获取小的
        System.out.println(Math.min(num, num2));
        // 向上取整
        System.out.println(Math.ceil(num3));
        // 向下取整
        System.out.println(Math.floor(num3));
        // 四舍五入
        System.out.println(Math.round(num3));
        /**
         * 随机数获取
         * 使用Random类
         * 常用 nextDouble,nextInt,nextFloat,nextBoolean
         */
        Random r = new Random();
        // 生成[0,10)之间的整数
        System.out.println(r.nextInt(10));
        // 生成[10, 20)之间的整数
        System.out.println(10 + r.nextInt(10));
    }
}
