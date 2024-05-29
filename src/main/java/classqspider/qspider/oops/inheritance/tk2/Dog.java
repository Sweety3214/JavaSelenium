package classqspider.qspider.oops.inheritance.tk2;

public class Dog extends AnimalP {
    String dogBreed="labrador";
    public void bark(){
        System.out.println("Sound");
    }

    public static void main(String[] args) {

     Dog dog=new Dog();

     dog.bark();
     dog.eat();
        System.out.println(dog.dogBreed);
        System.out.println(dog.animalHeight);
    }
}
