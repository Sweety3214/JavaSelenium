package classqspider.task.equals;

public class CarEqual {
    public static void main(String[] args) {
        Car car=new Car("Tata",250,"White");
        Car car1=new Car("Tesla",350,"Black");
        System.out.println(car==car1);
        System.out.println(car.equals(car1));
    }
}

