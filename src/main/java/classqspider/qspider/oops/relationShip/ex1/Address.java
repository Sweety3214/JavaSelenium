package classqspider.qspider.oops.relationShip.ex1;

public class Address {
    private int doorNum;
    private String studentArea;

    public int getDoorNum() {
        return doorNum;
    }

    public void setDoorNum(int doorNum) {
        this.doorNum = doorNum;
    }

    public String getStudentArea() {
        return studentArea;
    }

    public void setStudentArea(String studentArea) {
        this.studentArea = studentArea;
    }

    public Address(int doorNum, String studentArea) {
        this.doorNum = doorNum;
        this.studentArea = studentArea;
    }

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "doorNum=" + doorNum +
                ", studentArea='" + studentArea + '\'' +
                '}';
    }
}
