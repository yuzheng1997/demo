package fish.little.base_demo.array_demo;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {94,56,25,63,48,46};
        int[] arr2 = bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(binarySearch(arr, 63));
    }

    /**
     * 冒泡排序并返回一个新数组
     * 冒泡原理，双重循环，每次相邻两个元素比较，前者大于后者则交换
     * 里层循环完成后，最后一个元素是最大的
     * 依次循环
     * @param arrays
     * @return
     */
    private static int[] bubbleSort(int[] arrays) {
        int len = arrays.length;
        int[] copyArrays = new int[len];
        int temp;
        System.arraycopy(arrays,0,copyArrays,0, len);
        for (int i = 0; i < len; i++) {
            /**
             * 优化，如内层没有元素交换则排序已经完成
             * 后面就不用循环
             */
            boolean flag = true;
            for (int j =0; j < len - 1 - i; j++) {
                if (copyArrays[j] > copyArrays[j + 1]) {
                    temp = copyArrays[j];
                    copyArrays[j] = copyArrays[j + 1];
                    copyArrays[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        return copyArrays;
    }

    /**
     * 二分法查找
     * @param arrays
     * @param value
     * @return
     */
    private static int binarySearch(int[] arrays, int value) {
        int start = 0;
        int end = arrays.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (value == arrays[middle]) {
                //返回查询到的索引位置
                return middle;
            }
            if (value > middle) {
                start = middle + 1;
            }
            if (value < middle) {
                end = middle -1;
            }
        }
        //上面循环完毕，说明未找到，返回-1
        return -1;
    }
}
