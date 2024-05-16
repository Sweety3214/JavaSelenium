package classqspider.qspider.constructor.cir;

public class Circles {
    public static double compteDiameter(Circle c) {  // 2*radius formula for diameter


        return 2 * c.getRadios();
    }

    public static double computeArea(Circle c) {    //A=Pi r^2

        return (22.0 / 7.0) * (c.getRadios()) * (c.getRadios());
    }

    public static double computeCircum(Circle c) {   //  A=(c/2)r-----c=Ar*2

        return 2 * (22.0 / 7.0) * (c.getRadios());
    }
}
