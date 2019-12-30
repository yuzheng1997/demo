package fish.little.base_demo.socket_demo.socket2;

import lombok.Data;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author ：yuzheng
 * @date ：Created in 2019/12/26 11:25
 * @description：
 * @modified By：
 * @version: $
 */
@Data
public class SendServe implements Runnable {
    private Socket socket;
    public SendServe(Socket s) {
        this.socket = s;
    }

    @Override
    public void run() {
        try {
            OutputStream os = socket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            while (true) {
                Scanner scanner = new Scanner(System.in);
                dos.writeUTF(scanner.next());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
