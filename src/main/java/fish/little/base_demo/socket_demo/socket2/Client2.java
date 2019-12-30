package fish.little.base_demo.socket_demo.socket2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ：yuzheng
 * @date ：Created in 2019/12/26 13:47
 * @description：
 * @modified By：
 * @version: $
 */
public class Client2 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        Socket s = ss.accept();
        new Thread(new SendServe(s)).start();
        new Thread(new AcceptServe(s)).start();
    }
}
