package fish.little.base_demo.array_demo;

import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) {
        // 数组的声明和复制
        Integer [] arrays = {1, 2, 3};
        int len = arrays.length;
        Integer [] arrays1 = new Integer[len];
        System.arraycopy(arrays,0,arrays1,0,len);
        // 数组遍历
        for(Integer i : arrays1) {
            System.out.println(i);
        }

//        for(int i = 0; i < len; i++) {
//            System.out.println(i);
//        }
        // 数组转字符串
        System.out.println(Arrays.toString(arrays1));
    }
}
