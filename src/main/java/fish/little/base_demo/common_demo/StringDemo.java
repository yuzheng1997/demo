package fish.little.base_demo.common_demo;

public class StringDemo {
    public static void main(String[] args) {
        String str = "hello world";
        String str2 = "hello java";
        // 截取字符串
        String newStr = str.substring(0, 5);
        System.out.println(newStr);
        // 字符串拼接
        System.out.println(str + str2);
        System.out.println(str.concat(str2));

        StringBuilder stringBuilder = new StringBuilder("hello");
        stringBuilder.append("world");
        System.out.println(stringBuilder);
        // 在指定位置插入
        stringBuilder.insert(5, " ");
        // 删除一段字符
        stringBuilder.delete(0, 5);
        System.out.println(stringBuilder);
        // 反转
        stringBuilder.reverse();

    }
}
