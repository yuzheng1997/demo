package fish.little.base_demo.array_demo;

import lombok.Data;

import java.util.Arrays;

public class demo2 {
    public static void main(String[] args) {
        int[] arrays = {85,63,84,90,50};
        // 对数组排序，升序
        Arrays.sort(arrays);
        System.out.println(Arrays.toString(arrays));

        /**
         * 对对象类型的数组需要重写Comparable里的compareTo方法
         *  也可以使用匿名方法实现
         */
        Dog[] dogs = { new Dog("汪汪",5),new Dog("旺财",3),new Dog("欢欢",4),new Dog("猫",1) };
        Cat[] cats = { new Cat("猪",5),new Cat("狗",3),new Cat("牛",4),new Cat("驴",1) };
        Arrays.sort(cats, (o1, o2) -> {
            if (o1.getAge() > o2.getAge()) {
                return 1;
            }
            if (o1.getAge() < o2.getAge()) {
                return -1;
            }
            return 0;
        });
        System.out.println(Arrays.toString(cats));
        Arrays.sort(dogs);
        System.out.println(Arrays.toString(dogs));
    }
    @Data
    static class Dog implements Comparable{
        public Dog(String name, int age) {
            this.age = age;
            this.name = name;
        }
        private String name;
        private int age;

        @Override
        public int compareTo(Object o) {
            Dog dog = (Dog) o;
            if (this.age < dog.getAge()) {
                return -1;
            }
            if (this.age > dog.getAge()) {
                return 1;
            }
            return 0;
        }
    }
    @Data
    static class Cat {
        public Cat(String name, int age) {
            this.age = age;
            this.name = name;
        }
        private String name;
        private int age;
    }
}
