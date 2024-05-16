package classqspider.qspider.oops.relationShip.HasAConstru;

public class EngCar {
    String bName;    //primitive
    double topSpeed;
    Engine engine;    // object variable non primitive

    public EngCar(String bName, double topSpeed, Engine engine) {
        this.bName = bName;
        this.topSpeed = topSpeed;
        this.engine = engine;
    }

    public void engCarTest() {
        System.out.println("Driving to KK");
    }
}
