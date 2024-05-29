package classqspider.build.hashcodeclass.ex1;

public class BottleMain {
    public static void main(String[] args) {
        Bottle bottle=new Bottle();
        bottle.setBottleBrand("MILTON");
        bottle.setBottleColor("White");
        bottle.setBottleRate(700);
        System.out.println(bottle.getBottleBrand());
        System.out.println(bottle.getBottleColor());
        System.out.println(bottle.getBottleRate());

        System.out.println(bottle.toString());

        System.out.println(bottle.hashCode());

    }
}
