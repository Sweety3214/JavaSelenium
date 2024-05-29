package classqspider.qspider.oops.polymorphism.methodoverloading;

public class MethodOverLoading {
    public static void main(String[] args) {
        add();
        add(0,6f);
        add(4.4,7.1);
    }
    public static void add(){
        int a=3,b=9;
        System.out.println(a+b);
    }
    public static  void add(int a, float b){
        a=9;
        b=8;
        System.out.println(a+b);
    }
    public static void add(double c, double f){
        System.out.println(c+f);
    }
}
/*METHOD OVERLOADING
no of method contain same method name
it differ by length or types data types*/