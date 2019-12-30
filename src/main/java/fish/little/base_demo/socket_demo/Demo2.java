package fish.little.base_demo.socket_demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ：yuzheng
 * @date ：Created in 2019/12/25 15:17
 * @description：
 * @modified By：
 * @version: $
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        Process p = Runtime.getRuntime().exec("ping " + "192.168.138.193");
        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream(), "GBK"));
        String line = null;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            if (line.length() != 0) {
                sb.append(line + "\r\n");
            }
        }
        System.out.println(sb.toString());
    }
}
