package fish.little.base_demo.reflection_demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author ：yuzheng
 * @date ：Created in 2019/12/26 16:29
 * @description：
 * @modified By：
 * @version: $
 */
public class Demo3 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = Base.class;
        Constructor constructor = clazz.getConstructor();
        Base base = (Base)constructor.newInstance();
        base.setName("颤三");
        base.getMsg();
    }
}
