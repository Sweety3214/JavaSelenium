package classqspider.qspider.oops.interfacefolder.singleinterface;


interface Demo{
    String demoName="INTERFACE model";    // final and static

    void demoMethod();      // abstract method without body


    //static and default metho is java 8  onwards
    static  void staticMethod(){   // static method ---normal method
        System.out.println("Static Method");
    }
    default void defaultMethod(){   //default
        System.out.println("default");
    }

}

public class InterfaceDemo implements Demo{
    public void demoMethod(){
        System.out.println("from interface");
    }
    public void classMethod(){
        System.out.println("From class");
    }
    public static void main(String[] args) {
        //scenario 1
        InterfaceDemo interfaceDemo=new InterfaceDemo();
        interfaceDemo.demoMethod();   // we implement by obj name of class
        interfaceDemo.classMethod();
        interfaceDemo.defaultMethod();  // we can also call default by obj name
        Demo.staticMethod();   // we can call static in interface only defining the class name

        // scenario2
        Demo demo=new InterfaceDemo();   // implement using upcasting
        demo.demoMethod();
        System.out.println(demo.demoName);
    }

}
