package classqspider.qspider.oops.polymorphism.methodoverloading;

public class PhoneTypeOverLoading {
    static String phoneName="Reliance";
    public static void phonecolor(){
        System.out.println("phone color is black");
    }
    public static void phonecolor(String name){
        System.out.println("land line color is White");
    }

    public static void main(String[] args) {
       phonecolor();
    }

}
