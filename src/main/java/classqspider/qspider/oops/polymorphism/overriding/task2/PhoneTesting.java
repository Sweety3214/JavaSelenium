package classqspider.qspider.oops.polymorphism.overriding.task2;

public class PhoneTesting {
    public static void main(String[] args) {
        LandLine landLine = new LandLine();
        landLine.phoneColor();

        Phone phone = new Phone();
        phone.phoneColor();

        Phone phone1 = new LandLine();
        phone1.phoneColor();
    }
}
