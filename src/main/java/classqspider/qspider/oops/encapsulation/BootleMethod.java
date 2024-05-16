package classqspider.qspider.oops.encapsulation;

public class BootleMethod {
    public static void main(String[] args) {
        Bottle bottle = new Bottle();
        bottle.setbColor("WHITE");
        bottle.setbRate(120);
        bottle.setNumOfBottle(1);

        System.out.println(bottle.getbColor());
        System.out.println(bottle.getbRate());
        System.out.println(bottle.getNumOfBottle());

    }
}
