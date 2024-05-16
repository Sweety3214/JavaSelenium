package classqspider.qspider.constructor;

public class BottleMethod {
    public static void main(String[] args) {
        Bottle constructorTask = new Bottle("pink", 120, 1);
        Bottle constructorTask1 = new Bottle("white", 123, 2);
        System.out.println(constructorTask1.bNum);
        demo(new Bottle("pink", 120, 1));
        demo(constructorTask1);
        demo(constructorTask);
    }

    public static void demo(Bottle c) {
        System.out.println(c);
    }
}
