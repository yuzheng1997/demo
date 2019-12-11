package fish.little.base_demo.IODemo;

import java.io.*;

/**
 * 文件字节流使用
 * @author ：yuzheng
 * @date ：Created in 2019/12/10 15:03
 * @description：
 * @modified By：
 * @version: $
 */
public class BaseDemo {
    public static void main(String[] args) {
        File file = new File("D:\\test.txt");
        File copyFile = new File("D:\\COPY.txt");
        byte[] item = new byte[(int) file.length()];
        try (FileInputStream fis = new FileInputStream(file)){
            fis.read(item);
            System.out.println(new String(item, "utf-8"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileOutputStream fos = new FileOutputStream(copyFile, true)) {
            System.out.println("写入成功");
            fos.write(item);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
