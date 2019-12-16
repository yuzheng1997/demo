package fish.little.base_demo.math_demo;

import java.util.Arrays;

public class BigNumberDemo2 {
    public static void main(String[] args) {
        String a = "100";
        String b = "80090";
        char [] largeNum;
        char [] smallNum;
        int [] product;
        if (a.length() > b.length()) {
            largeNum = a.toCharArray();
            smallNum = b.toCharArray();
        } else {
            largeNum = b.toCharArray();
            smallNum = a.toCharArray();
        }
        // 获取大数和小数
        int largeLen = largeNum.length;
        int smallLen = smallNum.length;
        product = new int[largeLen + smallLen];
        for (int i = 0; i < smallLen; i++) {
            for (int j = 0; j < largeLen; j++) {
                int num1 = smallNum[smallLen - i - 1] - '0';
                int nmu2 = largeNum[largeLen - j -1] - '0';
                product[j + i] += num1 * nmu2;
            }
        }
        for (int i = 0; i < product.length - 1; i++) {
            if (product[i] > 9) {
                product[i + 1] = product[i]/10;
                product[i] = product[i]%10;
            }
        }
        System.out.println(Arrays.toString(product));
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < product.length; i++) {
            stringBuilder.append(product[product.length - 1 - i]);
        }
        String result = stringBuilder.toString();
        if (result.startsWith("0")) {
            result = result.substring(1);
        }
        System.out.println(result);
    }
}
