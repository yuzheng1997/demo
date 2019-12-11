package fish.little.base_demo.IODemo;

import java.io.*;

/**
 * @author ：yuzheng
 * @date ：Created in 2019/12/10 16:08
 * @description：
 * @modified By：
 * @version: $
 */
public class ReaderDemo {
    public static void main(String[] args) {
        File file = new File("D:\\test.txt");
        File copyFile = new File("D:\\COPY.txt");
        char[] item = new char[1024];
        try (FileReader fileReader = new FileReader(file); FileWriter fileWriter = new FileWriter(copyFile, true)) {
            int len = 0;
            while ((len = fileReader.read(item)) != -1) {
                fileWriter.write(item, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
