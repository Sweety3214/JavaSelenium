package classqspider.qspider.oops.inheritance.hirarical.bank;

public class PersonalAccount extends Account{

    private String name;
    private String houseAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    @Override
    public String toString() {
        return "PersonalAccount{" + "name='" + name + '\'' + ", houseAddress='" + houseAddress + '\'' +  '}';
    }
}
// "+ accountNumber=' " + accountNumber + '\' ' + ",ifscCode='" +ifscCode + '\''