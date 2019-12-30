package fish.little.base_demo.reflection_demo;

import com.fasterxml.jackson.databind.ser.Serializers;

/**
 * @author ：yuzheng
 * @date ：Created in 2019/12/26 15:36
 * @description：
 * @modified By：
 * @version: $
 */
public class Demo1 {
    /**
     * 获取类对象
     * Class.forName
     * new Object.getClass
     * Object.class
     * @param args
     */
    public static void main(String[] args) throws ClassNotFoundException {
        Class baseClass = Class.forName("fish.little.base_demo.reflection_demo.Base");
        Class baseClass1 = new Base("张三","23","女").getClass();
        Class baseClass2 = Base.class;
        System.out.println(baseClass == baseClass1);
        System.out.println(baseClass1 == baseClass2);
    }
}
