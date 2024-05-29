package classqspider.qspider.oops.polymorphism.methodoverloading;

public class Calculate {

    static double acoountBalance = 500000;


    // HOT CASH-amount--input
    //return string--payment way
    public String processPayment(double cash) {
        String cashBalance = " You paid the " + cash + " Your process has started.THANK YOU";
        return cashBalance;
    }

    //Gpay--amount,tax
    //return string--payment way,how much balance in account

    //Total Cost=Basic Cost+(Basic Cost×Tax Rate)
    public String processPayment(double gpay, double tax) { //100, 10%
       double totalCost=gpay+(gpay * tax);

       String gpayBalance="Our total cost is " +totalCost+ " Your balance amount is " +(acoountBalance-totalCost);

       return gpayBalance;

    }
    //card --amount, tax, card owner
    //return string--payment way,how much balance in account

    public String processPayment(double card, double tax, String ownerName) {
     double totalCost=card+(card+tax);
     String cardBalance="Hello Mr"+ ownerName+ "Your total cost is " +totalCost+" Your amount is " +(acoountBalance-totalCost);
     return cardBalance;
    }

    public static void main(String[] args) {
Calculate calculate=new Calculate();

  String gpayBalance =  calculate.processPayment(5000,500);
   String cardBalance= calculate.processPayment(15000,2000,"Jo");
   String cashBalance= calculate.processPayment(5000,500);
        System.out.println(gpayBalance);
        System.out.println(cardBalance);
        System.out.println(cashBalance);
    }
}
