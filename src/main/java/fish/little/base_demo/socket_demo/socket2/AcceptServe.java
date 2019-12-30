package fish.little.base_demo.socket_demo.socket2;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author ：yuzheng
 * @date ：Created in 2019/12/26 13:41
 * @description：
 * @modified By：
 * @version: $
 */
public class AcceptServe implements Runnable{
    private Socket socket;
    public AcceptServe(Socket s) {
        this.socket = s;
    }

    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            while (true) {
                System.out.println(dis.readUTF());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
