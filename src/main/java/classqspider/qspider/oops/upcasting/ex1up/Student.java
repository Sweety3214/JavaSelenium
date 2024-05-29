package classqspider.qspider.oops.upcasting.ex1up;

public class Student extends Animal {
    private int  studentId;
public void student(){
    System.out.println(5);
}
    public static void main(String[] args) {
        Student student=new Student();

        Animal animal=student;

        System.out.println(animal);
    }
}
