package cn.youxiu;

public class Chapter01_static {
    public static void main(String[] args) {

        Circle circle = new Circle();
        Circle circle1 = new Circle();


        System.out.println(circle);
        System.out.println(circle1);

    }


}
class Circle{
    int id ;

    public Circle(){
        this.id = init;
        init++;
    }
    private   int init = 1001;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInit() {
        return init;
    }

    public void setInit(int init) {
        this.init = init;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "id=" + id +
                ", init=" + init +
                '}';
    }
}