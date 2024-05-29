package classqspider.qspider.oops.relationShip.HasAConstru;

public class Car {
    private String brandName;    //primitive
    private String carColor;
    private Engine engine;    // object variable non primitive

    public Car(String brandName, String carColor, Engine engine) {
        this.brandName = brandName;
        this.carColor = carColor;
        this.engine = engine;
    }

    public Car() {
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;

    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                ", carColor='" + carColor + '\'' +
                ", engine=" + engine +
                '}';
    }
}

