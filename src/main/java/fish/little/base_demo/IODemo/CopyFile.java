package fish.little.base_demo.IODemo;

import java.io.*;

/**
 * @author ：yuzheng
 * @date ：Created in 2019/12/10 17:51
 * @description：
 * @modified By：
 * @version: $
 */
public class CopyFile {
    public static void main(String[] args) {
        File file = new File("E:\\a");
        StringBuilder stringBuilder = new StringBuilder("D:/");
//        copyDirectory(file, stringBuilder);
    }
    public static void copyDirectory(File file, StringBuilder basePath) {
        // basePath = D:/
        copy(file, basePath);
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                copyDirectory(f, basePath);
            }
        }
    }
    public static void copy(File file, StringBuilder to) {
        File f = new File(to.toString());
        if (file.isDirectory()) {
            f.mkdir();
        } else if (file.isFile()){
            try (FileInputStream fileInputStream = new FileInputStream(file);
                 BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                 FileOutputStream fileOutputStream = new FileOutputStream(f);
                 BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)
            ) {
                byte[] item = new byte[1024];
                int len = 0;
                while ((len = bufferedInputStream.read(item)) != -1) {
                    bufferedOutputStream.write(item, 0, len);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("未知");
        }
    }
    public static String getUrl(File file, String root) {
        String url = file.getAbsolutePath();
        int index = url.indexOf(root);
        return url.substring(index);
    }
}
