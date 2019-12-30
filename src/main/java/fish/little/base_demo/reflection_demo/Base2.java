package fish.little.base_demo.reflection_demo;

/**
 * @author ：yuzheng
 * @date ：Created in 2019/12/26 16:08
 * @description：
 * @modified By：
 * @version: $
 */
public class Base2 {
    static String test;
    private String name;
    private String age;
    private String gender;
    static {
        test = "hello world";
        System.out.println(test);
    }
    public Base2 () {}
    public Base2(String name, String age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public synchronized void getMsg() {
        System.out.println("我叫" + this.name + "今年" + this.age + "岁");
    }
    public void getGen() {
        System.out.println(gender);
    }
}
