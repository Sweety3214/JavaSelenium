package classqspider.qspider.oops.inheritance.multiLevel.ex1;

public class GFather {
    static  String name = "KC";
    public static void gName(){
        System.out.println("NAme of the grand Father is " + name);
    }


    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        GFather.name = name;
    }

}
