package fish.little.base_demo.reflection_demo;

import lombok.Data;

/**
 * @author ：yuzheng
 * @date ：Created in 2019/12/26 15:38
 * @description：
 * @modified By：
 * @version: $
 */
@Data
public class Base {
    static String test;
    private String name;
    private String age;
    private String gender;
    static {
        test = "hello world";
        System.out.println(test);
    }
    public Base () {}
    public Base(String name, String age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void getMsg() {
        System.out.println("我叫" + this.name + "今年" + this.age + "岁");
    }
    public void getGen() {
        System.out.println(111);
    }
}
