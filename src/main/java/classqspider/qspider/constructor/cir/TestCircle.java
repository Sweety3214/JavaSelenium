package classqspider.qspider.constructor.cir;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Circle circle1 = new Circle(4);
        //find the diameter of c1 & c2
        System.out.println("c1" + Circles.compteDiameter(circle));
        System.out.println("c2 " + Circles.compteDiameter(circle1));
    }
}
