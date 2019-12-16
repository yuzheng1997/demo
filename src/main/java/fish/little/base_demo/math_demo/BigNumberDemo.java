package fish.little.base_demo.math_demo;

public class BigNumberDemo {
    public static void main(String[] args) {
        String a = "10010";
        String b = "80090";
        char [] largeNum;
        char [] smallNum;
        int [] sums;
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
        sums = new int[largeLen + 1];
        for (int i = 0; i < largeLen; i++) {
            sums[i] = largeNum[largeLen - i -1] - '0';
        }
        for (int i = 0; i < smallLen; i++) {
            sums[i] += smallNum[smallLen - i - 1] - '0';
        }
        for (int i = 0; i < sums.length; i++) {
            if (sums[i] > 9) {
                sums[i + 1] += sums[i] / 10;
                sums[i] = sums[i] % 10;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < largeLen + 1; i++) {
            stringBuilder.append(sums[largeLen - i]);
        }
        String result = stringBuilder.toString();
        if (result.startsWith("0")) {
            result = result.substring(1);
        }
        System.out.println(result);
    }
}
