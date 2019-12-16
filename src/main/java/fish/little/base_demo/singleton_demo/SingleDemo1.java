package fish.little.base_demo.singleton_demo;

/**
 * 懒汉模式
 * 使用是初始化
 */
public class SingleDemo1 {
    private static SingleDemo1 singleDemo1 = null;
    private SingleDemo1() {}
    private static SingleDemo1 getInstance() {
        if (singleDemo1 == null) {
            singleDemo1 = new SingleDemo1();
        }
        return singleDemo1;
    }
}
