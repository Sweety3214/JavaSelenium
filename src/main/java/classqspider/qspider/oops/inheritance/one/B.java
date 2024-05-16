package classqspider.qspider.oops.inheritance.one;

public class B extends A {
    String name = "jo";
    String place = "Chennai";

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.name);
        B b = new B();
        b.dummyClass();
        System.out.println(b.place1);
        System.out.println(b.name);
    }

}
