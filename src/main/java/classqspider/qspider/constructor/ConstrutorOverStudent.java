package classqspider.qspider.constructor;

public class ConstrutorOverStudent {
    String name;
    int age;
    int id;


    public ConstrutorOverStudent(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public ConstrutorOverStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ConstrutorOverStudent(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        ConstrutorOverStudent construtorOverStudent = new ConstrutorOverStudent("BAnu", 23, 101);
        System.out.println(construtorOverStudent.name);
        System.out.println(construtorOverStudent.age);
        System.out.println(construtorOverStudent.id);
    }
}
