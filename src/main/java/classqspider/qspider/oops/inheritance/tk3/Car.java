package classqspider.qspider.oops.inheritance.tk3;

public class Car extends Vehicle{
    private int carSpeed;

    public int getCarSpeed() {
        return carSpeed;
    }

    public void setCarSpeed(int carSpeed) {
        this.carSpeed = carSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carSpeed=" + carSpeed +
                '}';
    }
}
