package classqspider.task.equals;

public class Car {
    String bname;
    double topSpeed;
    String color;

    public Car(String bname, double topSpeed, String color) {
        this.bname = bname;
        this.topSpeed = topSpeed;
        this.color = color;
    }

  /*  @Override
    public boolean equals(Object obj) {
        Car converting=(Car)obj;
        return this.bname== converting.bname&&this.color==converting.color&&this.topSpeed==converting.topSpeed;
    }*/
}
