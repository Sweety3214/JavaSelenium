package classqspider.qspider.oops.oopstasksinglefile;
public class MainClass {
    public static void main(String[] args) {
        //encapsulation.Student
        School school = School.setSchoolDetailsUsingSetter();
        System.out.println(school);
        //OverMethod
        StudentsOverMethod.studentDetails(2000);
        StudentsOverMethod.studentDetails(2000, 1200);
        StudentsOverMethod.studentDetails(2000, 1200, 800);

        //OverRiding
        Student1Overriding student1Overriding = new Student1Overriding();
        student1Overriding.girsDetails();
        StudentsOverRiding studentsOverRiding = new StudentsOverRiding();
        studentsOverRiding.girsDetails();

        //Abstract
        TeacherAbstractClass teacherAbstractClass = new TeacherAbstractClass();
        teacherAbstractClass.abstractMethod();

        //Single inheritance-tenth
        Twelth twelth = new Twelth();
        twelth.displayTwelth();
        twelth.displayTenthMark();
    }
}

//Encapsulation-School

class School {
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

// Polymorphism--Over riding
class StudentsOverRiding {
    public void girsDetails() {
        System.out.println("total num of boys is 800");
    }
}

class Student1Overriding extends StudentsOverRiding {

    public void girsDetails() {
        System.out.println("total num of girls is 12000");
    }

}

//Method Overloading
class StudentsOverMethod {


    public static void studentDetails(int noOfStudents) {
        System.out.println("Totatl no of students" + "" + noOfStudents);
    }

    public static void studentDetails(int noOfStudents, int noOfGirls) {
        System.out.println("Total num of girls" + " " + noOfGirls);
    }

    public static void studentDetails(int noOfStudents, int noOfGirls, int noOfBoys) {
        System.out.println("Total num of boys" + " " + noOfBoys);
    }
}

//Abstract
abstract class TeacherAbstract {
    abstract void abstractMethod();   //abstract method
}

class TeacherAbstractClass extends TeacherAbstract {
    void abstractMethod() {
        System.out.println("FROM ABSTRACT METHOD");
    }


}

//SINGLE INHERITANCE
class Tenth {
    private int mark = 400;
    private int noOfSubject = 5;

    public void displayTenthMark() {
        System.out.println("Mark in 10th " + mark + " total no of subject is " + noOfSubject);
    }


}

class Twelth extends Tenth {
    int twelthMark = 1000;
    String groupName = "Bio";

    public void displayTwelth() {
        System.out.println("12 th mark in " + groupName + " group is " + twelthMark);
    }
}



