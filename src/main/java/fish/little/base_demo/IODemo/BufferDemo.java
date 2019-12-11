package fish.little.base_demo.IODemo;

import java.io.*;

/**
 * @author ：yuzheng
 * @date ：Created in 2019/12/10 16:20
 * @description：
 * @modified By：
 * @version: $
 */
public class BufferDemo {
    public static void main(String[] args) {
        String from = "E:\\beifun\\zhongdeng-web\\.editorconfig";
        String to = "D:/.editorconfig";
        String to2 = "D:/.editorconfig2";
        byteMethod(from, to);
        charMethod(from, to2);
    }
    public static void byteMethod(String from, String to) {
        File file = new File(from);
        File copy = new File(to);
        /**
         * try ()方式关闭流
         * 普通try中后打开的流先关闭
         */
        try (FileInputStream fileInputStream = new FileInputStream(file);
             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
             FileOutputStream fileOutputStream = new FileOutputStream(copy);
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)
        ) {
            byte [] item = new byte[1024];
            int len = 0;
            while ((len = bufferedInputStream.read(item)) != -1) {
                bufferedOutputStream.write(item, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void charMethod(String from, String to) {
        File file = new File(from);
        File copy = new File(to);
        /**
         * try ()方式关闭流
         * 普通try中后打开的流先关闭
         */
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter(copy);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            char [] item = new char[100];
            int len = 0;
            // 常用的还有readLine读，write写，newLine换行
            while ((len = bufferedReader.read(item)) != -1) {
                bufferedWriter.write(item, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
