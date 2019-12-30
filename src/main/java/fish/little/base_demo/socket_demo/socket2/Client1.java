package fish.little.base_demo.socket_demo.socket2;

import java.io.IOException;
import java.net.Socket;

/**
 * @author ：yuzheng
 * @date ：Created in 2019/12/26 13:44
 * @description：
 * @modified By：
 * @version: $
 */
public class Client1 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8888);
        new Thread(new SendServe(socket)).start();
        new Thread(new AcceptServe(socket)).start();
    }
}
