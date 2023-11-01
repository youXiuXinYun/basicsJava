package cn.designMode.picture;

public class BankTest {
    public static void main(String[] args) {
        Bank instance = Bank.getInstance();

    }
}
//饿汉式
class Bank{
    //1.类的构造器私有化
    private Bank(){

    }

    //2.在类的内被创建当前类的实例
    private static Bank instance = new Bank();

    //3.使用get 方法获取当前类的实例，必须声明为static
    public static Bank getInstance(){
        return  instance;
    }

}
