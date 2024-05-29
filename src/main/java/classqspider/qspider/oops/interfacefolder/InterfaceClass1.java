package classqspider.qspider.oops.interfacefolder;


interface Interface1 {   // interface class define interface before ClassName
    int len=10;           
    //final and static  variable
    void abstractmethod();   // abstract metho---default public method

    public class InterfaceClass1 implements Interface1{   // normal class
        public void abstractmethod() {  // we implement abstract method from interface class
            ;
        }

        public static void main(String[] args) {
            InterfaceClass1  interfaceClass1=new InterfaceClass1();
            interfaceClass1.abstractmethod();
            System.out.println(interfaceClass1.len);
        }
    }

}

