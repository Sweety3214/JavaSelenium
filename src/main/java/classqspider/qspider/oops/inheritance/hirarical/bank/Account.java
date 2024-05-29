package classqspider.qspider.oops.inheritance.hirarical.bank;

public class Account {

    private Long accountNumber;
    private String ifscCode;

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", ifscCode='" + ifscCode + '\'' +
                '}';
    }
}
