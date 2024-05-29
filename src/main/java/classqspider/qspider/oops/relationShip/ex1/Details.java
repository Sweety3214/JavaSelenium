package classqspider.qspider.oops.relationShip.ex1;

public class Details {
    public static void main(String[] args) {

        Student student = setStudentDetailsUsingSetter();
        System.out.println(student);

        Student student1= getStudentsDetailsUsingConstructor() ;
        System.out.println(student1);
    }



    private static Student getStudentsDetailsUsingConstructor() {
        Address address = new Address(1, "Statebank");
        Student student = new Student("Jo", 202, address);
        return student;
    }

    private static Student setStudentDetailsUsingSetter() {
        Address address = new Address();
        address.setStudentArea("Arumanai");
        address.setDoorNum(3/97);
        Student student = new Student();
        student.setStudentName("BANU");
        student.setStudentId(102);
        student.setAddress(address);
        return student;
    }
}
