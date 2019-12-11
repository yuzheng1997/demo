package fish.little.base_demo.collection_demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @author ：yuzheng
 * @date ：Created in 2019/12/10 10:13
 * @description：
 * @modified By：
 * @version: $
 */
public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("容器是否为空：" + arrayList.isEmpty());
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int item = random.nextInt(50);
            arrayList.add(item);
        }
        System.out.println("容器大小：" + arrayList.size());
        System.out.println(arrayList.toString());
        // 在指定位置插入
        arrayList.set(0, 111);
        System.out.println(arrayList.toString());
        // 添加
        arrayList.add(120);
        // 按索引移除
        arrayList.remove(1);
        System.out.println(arrayList.toString());
        /**
         * 两个list操作
         * A.addAll(B) A添加全部B的元素
         * A.contains(B) A是否包含所有B的元素 返回boolean
         */
        List<String> list = new ArrayList<String>();
        list.add("高淇");
        list.add("高小七");
        list.add("高小八");

        List<String> list2 = new ArrayList<String>();
        list2.add("高淇");
        list2.add("张三");
        list2.add("李四");
        System.out.println(list.containsAll(list2)); //false list是否包含list2中所有元素
        System.out.println(list);
        list.addAll(list2); //将list2中所有元素都添加到list中
        System.out.println(list);
        list.removeAll(list2); //从list中删除同时在list和list2中存在的元素
        System.out.println(list);
        list.retainAll(list2); //取list和list2的交集
        System.out.println(list);
    }
}
