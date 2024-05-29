package classqspider.qspider.oops.relationShip.ex1;

public class Student {
    private String studentName;
    private int studentId;

    private Address address;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Student(String studentName, int studentId, Address address) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.address = address;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentId=" + studentId +
                ", address=" + address +
                '}';
    }
}
