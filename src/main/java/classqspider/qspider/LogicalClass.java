package classqspider.qspider;

public class LogicalClass {
    public static void main(String[] args) {

        //Logical AND &&
        String size = "XL";
        int price = 3000;

        System.out.println(((size == "XXL") && (price <= 3000)) ? "buy it" : "not buy"); //  only concentrate condition 1st cond is false 2nd is true so ans is "not buy"
        // true -buy it false not buy
        // both condition want satisfied
        System.out.println(((size == "XXL") || (price <= 3000)) ? "buy it" : "not buy");//  only concentrate condition 1st cond is false 2nd is true so ans is " buy"
        // true -buy it false not buy
        //any one condition want satisfied
        System.out.println((!(size == "XXL") ? "buy it" : "not buy"));

        String clr = "Pink";
        int rate = 4000;
        System.out.println(((clr == "Pink") && (rate >= 4000)) ? "yes" : "no");
    }
}
