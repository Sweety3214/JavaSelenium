package classqspider.qspider.oops.oopstask;

//Encapsulation
public class School {
    private String schoolName;
    private String schoolAddress;
    private int numOfStudents;

    public School(String schoolName, String schoolAddress, int numOfStudents) {
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
        this.numOfStudents = numOfStudents;
    }

    public School() {
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", schoolAddress='" + schoolAddress + '\'' +
                ", numOfStudents=" + numOfStudents +
                '}';
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public static School setSchoolDetailsUsingSetter() {
        School school = new School();
        school.setSchoolName("NMVK");
        school.setSchoolAddress("MARTHANDAM");
        school.setNumOfStudents(20000);
        return school;
    }
}



