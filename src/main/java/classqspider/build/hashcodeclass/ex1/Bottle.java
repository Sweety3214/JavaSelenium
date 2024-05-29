package classqspider.build.hashcodeclass.ex1;

import java.util.Objects;

public class Bottle {
private String bottleBrand;
private String bottleColor;
private int bottleRate;

    public String getBottleBrand() {
        return bottleBrand;
    }

    public void setBottleBrand(String bottleBrand) {
        this.bottleBrand = bottleBrand;
    }

    public String getBottleColor() {
        return bottleColor;
    }

    public void setBottleColor(String bottleColor) {
        this.bottleColor = bottleColor;
    }

    public int getBottleRate() {
        return bottleRate;
    }

    public void setBottleRate(int bottleRate) {
        this.bottleRate = bottleRate;
    }

    @Override
    public String toString() {
        return "Bottle{" +
                "bottleBrand='" + bottleBrand + '\'' +
                ", bottleColor='" + bottleColor + '\'' +
                ", bottleRate=" + bottleRate +
                '}';
    }



    @Override
    public int hashCode() {
        return Objects.hash(bottleBrand, bottleColor, bottleRate);
    }
}
