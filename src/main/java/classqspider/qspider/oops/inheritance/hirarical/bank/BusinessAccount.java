package classqspider.qspider.oops.inheritance.hirarical.bank;

public class BusinessAccount extends Account {

    private String companyName;
    private String companyAdress;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAdress() {
        return companyAdress;
    }

    public void setCompanyAdress(String companyAdress) {
        this.companyAdress = companyAdress;
    }

    @Override
    public String toString() {
        return "BusinessAccount{" +
                "companyName='" + companyName + '\'' +
                ", companyAdress='" + companyAdress + '\'' +
                '}';
    }
}
