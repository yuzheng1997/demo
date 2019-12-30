package fish.little.base_demo.socket_demo.socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ：yuzheng
 * @date ：Created in 2019/12/26 10:52
 * @description：
 * @modified By：
 * @version: $
 */
public class ServeDemo1 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        System.out.println("监听端口8888");
        Socket socket = ss.accept();
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        System.out.println("连接成功:" + socket);
        System.out.println("接收到客户端发送的:" + dis.readUTF());
        dis.close();
        socket.close();
        ss.close();
    }
}
