package classqspider.qspider.constructor;

public class ConstructorPhoneThis {
    String pName;
    double price;
    String color;
    String version;
    String year;

    public ConstructorPhoneThis(String pName) {
        this.pName = pName;
        System.out.println("This is phone name");
    }

    public ConstructorPhoneThis(String pName, double price) {
        this(pName);   //reusing
        this.price = price;
        System.out.println("this is phone name and price");
    }

    public ConstructorPhoneThis(String pName, double price, String color) {
        this(pName, price);
        this.color = color;
        System.out.println("this is phone name , price ,and color");
    }
}
