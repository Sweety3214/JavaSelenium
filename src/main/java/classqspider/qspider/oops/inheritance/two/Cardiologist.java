package classqspider.qspider.oops.inheritance.two;

public class Cardiologist extends Doctor {
    public static void main(String[] args) {
        System.out.println("Age of doctor " + age);
        Cardiologist cardiologist = new Cardiologist();
        cardiologist.display();


        Doctor doctor = new Doctor();
        doctor.display();
        System.out.println(cardiologist.age);
    }
}
