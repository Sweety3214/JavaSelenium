package classqspider.qspider.oops.inheritance.superkeyword;

public class College extends School {
    String sub="ECE";
   void name(){
        System.out.println("Group name in school is " + super.sub);
        System.out.println("Group name in school is " + this.sub);
        System.out.println("Department name in college is " + sub);
    }
}
