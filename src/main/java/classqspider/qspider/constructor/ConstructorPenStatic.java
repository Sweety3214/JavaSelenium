package classqspider.qspider.constructor;


public class ConstructorPenStatic {
    String pName;
    double price;
    String color;
    String version;
    String year;

    public ConstructorPenStatic(String pName) {
        this.pName = pName;
        System.out.println("This is pencil  name");
    }

    public ConstructorPenStatic(String pName, double price) {
        this(pName);   //reusing
        this.price = price;
        System.out.println("this is pencil name and price");
    }

    public ConstructorPenStatic(String pName, double price, String color) {
        this(pName, price);
        this.color = color;
        System.out.println("this is pencil name , price ,and color");
    }

    public static void main(String[] args) {
        ConstructorPhoneThis ConstructorPen = new ConstructorPhoneThis("HB", 25, "Black");
        System.out.println(ConstructorPen.pName);
        System.out.println(ConstructorPen.price);
        System.out.println(ConstructorPen.color);

    }
}




