package classqspider.qspider.constructor;

public class ConsNonStaticBike {
    String bikename = "BULLET";
    String Bikecolor = "WHITE";
    double bikePrice = 1200000;

    public static void main(String[] args) {
        ConsNonStaticBike consNonStaticBike = new ConsNonStaticBike();
        consNonStaticBike.nonStatic(consNonStaticBike);
        consNonStaticBike.ride();
    }

    public static void nonStatic(ConsNonStaticBike consNonStaticBike) {
        consNonStaticBike.ride();
        System.out.println(consNonStaticBike.bikename);
    }

    public void ride() {
        System.out.println("ride one time");
    }
}
