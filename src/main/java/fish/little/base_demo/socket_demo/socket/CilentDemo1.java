package fish.little.base_demo.socket_demo.socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author ：yuzheng
 * @date ：Created in 2019/12/26 10:54
 * @description：
 * @modified By：
 * @version: $
 */
public class CilentDemo1 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8888);
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        dos.close();
        System.out.println(socket);
        socket.close();
    }
}
