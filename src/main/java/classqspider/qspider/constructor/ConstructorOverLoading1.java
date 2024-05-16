package classqspider.qspider.constructor;


public class ConstructorOverLoading1 {  // program for buying cup
    String bName;
    String color;
    double price;

    ConstructorOverLoading1(String bName, String color) {    //argument cons
        this.bName = bName;
        this.color = color;
    }

    ConstructorOverLoading1(String bName, String color, double price) {    //argument cons
        this.price = price;
        this.color = color;
    }

    public static void main(String[] args) {
        ConstructorOverLoading1 constructorOverLoading1 = new ConstructorOverLoading1("CELLO", "PINK");
        System.out.println(constructorOverLoading1.bName);
        System.out.println(constructorOverLoading1.color);
        System.out.println(constructorOverLoading1.price);
    }
}
