package fish.little.base_demo.file_demo;

import java.io.File;

/**
 * @author ：yuzheng
 * @date ：Created in 2019/12/9 11:04
 * @description：
 * @modified By：
 * @version: $
 */
public class BaseFile {
    /**
     * 文件常用
     * exists()是否存在
     * isFile() 是否是文件
     * isDirectory() 是否为目录
     * length() 文件大小
     * getPath() 获取路径
     * createNewFile() 创建文件
     * mkdir() 创建文件夹，当父文件夹不存在时会失败
     * mkdirs() 创建文件夹，当父文件夹不存在时会创建父文件夹
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        // 获取相对路径的位置
        System.out.println(System.getProperty("user.dir"));
        File file = new File("test.txt");
        System.out.println("是否存在：" + file.exists());
        // 创建文件
         file.createNewFile();
        System.out.println("是否存在：" + file.exists());
        System.out.println("文件绝对路径:" + file.getAbsolutePath());
        System.out.println("文件路径：" + file.getPath());
    }
}
