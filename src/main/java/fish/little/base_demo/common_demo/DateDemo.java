package fish.little.base_demo.common_demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        long time = System.currentTimeMillis();
        System.out.println(time);
        // 初始化时间对象
        Date date = new Date(time);
        // 转成字符型
        System.out.println(date.toString());
        // 获取毫秒数
        System.out.println(date.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        // 转化为固定格式
        String str = sdf.format(date);
        System.out.println(str);
        String str2 = "2017-12-5";
        Date date1 = sdf1.parse(str2);
        System.out.println(date1);
    }
}
