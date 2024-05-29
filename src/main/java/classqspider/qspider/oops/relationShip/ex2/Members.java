package classqspider.qspider.oops.relationShip.ex2;

public class Members {
    private int noOfMembers;
    private String nameOfMembers;

    public Members(int noOfMembers, String nameOfMembers) {
        this.noOfMembers = noOfMembers;
        this.nameOfMembers = nameOfMembers;
    }

    public Members() {
    }

    public int getNoOfMembers() {
        return noOfMembers;
    }

    public void setNoOfMembers(int noOfMembers) {
        this.noOfMembers = noOfMembers;
    }

    public String getNameOfMembers() {
        return nameOfMembers;
    }

    public void setNameOfMembers(String nameOfMembers) {
        this.nameOfMembers = nameOfMembers;
    }

    @Override
    public String toString() {
        return "Members{" +
                "noOfMembers=" + noOfMembers +
                ", nameOfMembers='" + nameOfMembers + '\'' +
                '}';
    }
}
