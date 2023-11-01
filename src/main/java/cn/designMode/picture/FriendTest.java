package cn.designMode.picture;

public class FriendTest {
    public static void main(String[] args) {
        Friend instance = Friend.getInstance();

    }

}

class Friend{
    //1.类的构造器私有化
    private Friend(){

    }

    //2.声明类的实例
    private static Friend instance = null;

    //3.通过get方法获取当前类的实例，如果未创建对象，则在方法内部进行创建
    public static Friend getInstance() {
        if(instance == null){
            instance = new Friend();
        }
        return instance;
    }
}
