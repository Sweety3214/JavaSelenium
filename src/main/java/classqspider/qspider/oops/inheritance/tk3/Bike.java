package classqspider.qspider.oops.inheritance.tk3;

public class Bike extends Vehicle {
    private String bikeBrand;
    private String bikeColor;

    public String getBikeBrand() {
        return bikeBrand;
    }

    public void setBikeBrand(String bikeBrand) {
        this.bikeBrand = bikeBrand;
    }

    public String getBikeColor() {
        return bikeColor;
    }

    public void setBikeColor(String bikeColor) {
        this.bikeColor = bikeColor;
    }



    @Override
    public String toString() {
        return "Bike{" +
                "bikeBrand='" + bikeBrand + '\'' +
                ", bikeColor='" + bikeColor + '\'' +
                '}';
    }
}
