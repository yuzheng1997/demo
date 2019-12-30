package fish.little.base_demo.socket_demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author ：yuzheng
 * @date ：Created in 2019/12/25 15:03
 * @description：
 * @modified By：
 * @version: $
 */
public class Demo1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress host = InetAddress.getLocalHost();
        System.out.println(host);
    }
}
