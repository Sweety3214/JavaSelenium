package classqspider.qspider.oops.relationShip.HasAConstru;

public class EngCarTest {
    public static void main(String[] args) {

        Car car = setCarDetailsUsingSetter();
        System.out.println(car);

        Car car1= setCarVAluesUsingConstructor();
        System.out.println(car1);

    }

    private static Car setCarVAluesUsingConstructor() {
        Engine engine1=new Engine(23.5,"ELECTRIC");

        Car car1=new Car("TOYOTA" ," RED" ,engine1);
        return car1;
    }

    private static Car setCarDetailsUsingSetter() {

        Engine engine=new Engine();
        engine.setEngineSpeed(4555555.6);
        engine.setEngineType("ELECTRIC");

        Car car=new Car();
        car.setBrandName("TATA");
        car.setCarColor("WHITE");
        car.setEngine(engine);
        return car ;
    }



}
