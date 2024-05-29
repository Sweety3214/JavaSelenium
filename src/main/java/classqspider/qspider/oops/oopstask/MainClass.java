package classqspider.qspider.oops.oopstask;

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
