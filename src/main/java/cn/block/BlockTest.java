package cn.block;

/**
 * 代码块
 */
public class BlockTest {

    public static void main(String[] args) {
        System.out.println(Person.getInfo());
        Person person = new Person();
    }
}
class Person{
    int age;
    String name;
    static String info = "初始化";

    public static String getInfo() {
        return info;
    }

    static {

        System.out.println("静态成员被加载");
    }
    {
        name = "aa";
        System.out.println("非静态代码块加载");

    }

}
