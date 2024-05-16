package youtube;

public class Oops {
    //variable
    int id;
    int num;
    String name;

    public static void main(String[] args) {
        Oops oops = new Oops();   //object1
        oops.id = 21;
        oops.name = "banu";
        oops.num = 1;
        System.out.println(oops.id);
        //  oops.dummyMethod();
        Oops oops1 = new Oops();
        oops.id = 2;
        oops.name = "anu";
        oops.num = 2;
        System.out.println(oops1.id);

    }

    // method
    void dummyMethod() {     // void is no return type
        System.out.println(id);
        System.out.println(num);
    }
}
