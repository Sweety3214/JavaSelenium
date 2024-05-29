package classqspider.qspider.oops.inheritance.hirarical.bank;

public class MainClass {

    public static void main(String[] args) {


         PersonalAccount personalAccount = new PersonalAccount();
        personalAccount.setAccountNumber(1151651651L);
        personalAccount.setName("SWeety");
        personalAccount.setIfscCode("I1151651651");
        personalAccount.setHouseAddress("1F,............");

        BusinessAccount businessAccount = new BusinessAccount();
        businessAccount.setAccountNumber(1151651651L);
        businessAccount.setCompanyName ("SWeety Enterprize");
        businessAccount.setIfscCode("I1151651651");
        businessAccount.setCompanyAdress("2F,............");


        System.out.println(personalAccount);
        System.out.println(businessAccount);
        System.out.println(personalAccount.getAccountNumber());
        System.out.println(personalAccount.getIfscCode());
        System.out.println(businessAccount.getAccountNumber());
        System.out.println(businessAccount.getIfscCode());
        System.out.println(businessAccount.getAccountNumber());
        System.out.println(businessAccount.getIfscCode());;





    }

}
