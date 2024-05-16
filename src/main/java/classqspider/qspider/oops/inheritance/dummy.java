package classqspider.qspider.oops.inheritance;

class A {
    static String name;

    public void beforeExtends() {
        System.out.println("A CLASS");
    }
}

class B extends A {
    int age;

    public void afterExtend() {
        System.out.println("B CLASS");
    }
}

public class dummy {
    public static void main(String[] args) {
        B b = new B();
        b.afterExtend();
        System.out.println(b.name);
        b.beforeExtends();
        System.out.println(b.age);


    }
}
