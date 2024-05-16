package classqspider.qspider.constructor;

public class Bottle {
    String bColor;


    int bRAte;

    int bNum;


    Bottle(String bColor, int bRAte, int bNum) {
        this.bColor = bColor;
        this.bRAte = bRAte;
        this.bNum = bNum;


    }

    public Bottle(String bColor, int bRAte) {
        // this(bNum);
        this.bColor = bColor;
        this.bRAte = bRAte;
    }

    public void drinking() {
        System.out.println("USED TO DRINKING WATER");
    }
}
