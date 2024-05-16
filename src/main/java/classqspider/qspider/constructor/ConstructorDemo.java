package classqspider.qspider.constructor;

public class ConstructorDemo {

    // arguments === parameter

    int age;

    public ConstructorDemo(int age) {  // not return
        this.age = age;
    }

    public ConstructorDemo() {
    }

    public static void main(String[] args) {

        ConstructorDemo callsNoArgsConstructor = new ConstructorDemo();  // type 1 static

        callsNoArgsConstructor.noArgsMethod();
        ;  //type 2 non static no argument
        callsNoArgsConstructor.ArgsMethod(111);  //type 3 non static  para


        ConstructorDemo callsParameterizedConstructor = new ConstructorDemo(22);

        callsParameterizedConstructor.noArgsMethod();
        callsParameterizedConstructor.ArgsMethod(111);

        System.out.println(callsNoArgsConstructor.age);
        System.out.println();

    }

    public void noArgsMethod() {  //return type
        System.out.println("no args");
    }

    public void ArgsMethod(int name) {
        System.out.println("Parametrized");
    }
}
