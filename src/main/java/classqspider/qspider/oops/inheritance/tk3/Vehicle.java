package classqspider.qspider.oops.inheritance.tk3;

public class Vehicle {
    private String color="BLACK";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "color='" + color + '\'' +
                '}';
    }
}
