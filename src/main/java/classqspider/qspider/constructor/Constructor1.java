package classqspider.qspider.constructor;

public class Constructor1 {

    String name;
    int age;

    public Constructor1(String nationz, int age) {
        this.name = name;
        this.age = age;
    }

    public Constructor1(int age) {
        this.age = age;
    }

    public Constructor1() {
    }

    public Constructor1(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        // Constructor1 constructor1=new Constructor1();
        //  Constructor1 constructor11=new Constructor1("NB",21);
        //  Constructor1 constructor12=new Constructor1("LK", 52);
        Constructor1 constructor16 = new Constructor1();
        System.out.println(constructor16.name);
        System.out.println(constructor16.age);
        // Constructor1 constructor1=new Constructor1("nm");
        //Constructor1 constructor199=new Constructor1(55);
    }
}
