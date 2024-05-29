package classqspider.qspider.oops.inheritance.tk3;

public class VehicleTesting {
    public static void main(String[] args) {
        Car car=new Car();
      car.setCarSpeed(34);
      Bike bike=new Bike();
      bike.setBikeBrand("BULLET");
      bike.setBikeColor("White");



        System.out.println(car.getCarSpeed());
        System.out.println(car.getColor());
        System.out.println(bike.getBikeBrand());
        System.out.println(bike.getBikeColor());
        System.out.println(bike.getColor());


    }
}
