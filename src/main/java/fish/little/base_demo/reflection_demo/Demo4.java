package fish.little.base_demo.reflection_demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/**
 * @author ：yuzheng
 * @date ：Created in 2019/12/26 19:48
 * @description：
 * @modified By：
 * @version: $
 */
public class Demo4 {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("fish.little.base_demo.reflection_demo.Base");
//        Base base = (Base)clazz.getConstructor().newInstance("颤三", "12", "男");
        Method method = clazz.getMethod("getMsg");
        method.invoke(clazz.getConstructor(String.class, String.class, String.class).newInstance("颤三", "12", "男"));
    }
}
