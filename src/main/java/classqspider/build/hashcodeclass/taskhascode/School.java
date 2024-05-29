package classqspider.build.hashcodeclass.taskhascode;

import java.util.Objects;

public class School {
    private String schoolName;
    private String schoolAddress;
    private  int numOfStudents;

    public School(String schoolName, String schoolAddress, int numOfStudents) {
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
        this.numOfStudents = numOfStudents;
    }

    public School() {
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

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", schoolAddress='" + schoolAddress + '\'' +
                ", numOfStudents=" + numOfStudents +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof School school)) return false;
        return numOfStudents == school.numOfStudents && Objects.equals(schoolName, school.schoolName) && Objects.equals(schoolAddress, school.schoolAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolName, schoolAddress, numOfStudents);
    }
}
