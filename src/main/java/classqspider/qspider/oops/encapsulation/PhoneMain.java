package classqspider.qspider.oops.encapsulation;

public class PhoneMain {
    public static void main(String[] args) {
        Phone phone = new Phone("BANUJO");
        System.out.println(phone.getPw());
        phone.setPw("sdfgr");
        phone.setGallery("photos");

        System.out.println(phone.getPw());
        System.out.println(phone.getwChat());

    }
}
