package classqspider.qspider.oops.encapsulation.one;

import java.time.LocalDate;

public class ATM {
    public static void main(String[] args) {

        CardDetails banuCardSetails = new CardDetails();
        banuCardSetails.setBankname("IOB");
        banuCardSetails.setcType("debit");
        banuCardSetails.setCvv(666);
        banuCardSetails.setDate(LocalDate.now());
        banuCardSetails.setName("banu");
        banuCardSetails.setNum(123456789789l);
        banuCardSetails.setPin(3110);


        System.out.println(banuCardSetails.getName());
        System.out.println(banuCardSetails.getBankname());
        System.out.println(banuCardSetails.getPin());
        System.out.println(banuCardSetails.getNum());
        System.out.println(banuCardSetails.getcType());
        System.out.println(banuCardSetails.getDate());


        CardDetails joCardDetails = new CardDetails();
        joCardDetails.setName("JO");
        joCardDetails.setBankname("AXIS");
        joCardDetails.setNum(123456789089l);
        joCardDetails.setPin(0624);
        joCardDetails.setDate(LocalDate.now());
        joCardDetails.setCvv(668);
        joCardDetails.setcType("Debit");

        System.out.println(joCardDetails.getName());
        System.out.println(joCardDetails.getBankname());
        System.out.println(joCardDetails.getNum());
        System.out.println(joCardDetails.getPin());
        System.out.println(joCardDetails.getCvv());
        System.out.println(joCardDetails.getcType());


    }
}
