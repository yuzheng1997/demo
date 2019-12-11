package fish.little.base_demo.file_demo;

import java.io.File;

/**
 * 递归遍历文件
 * @author ：yuzheng
 * @date ：Created in 2019/12/9 14:38
 * @description：
 * @modified By：
 * @version: $
 */
public class IteratorFile {
    public static void main(String[] args) {
        File file = new File("D:\\soft\\Google\\Chrome");
        iteratorFile(file, 0);
    }
    public static void iteratorFile(File file, int len) {
        // 显示层级关系
        for (int i = 0; i < len; i++) {
            System.out.print("-");
        }
        System.out.println(file.getName());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File file1 : files) {
                iteratorFile(file1, len + 1);
            }
        }
    }
}
