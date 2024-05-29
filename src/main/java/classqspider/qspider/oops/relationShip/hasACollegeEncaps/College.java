package classqspider.qspider.oops.relationShip.hasACollegeEncaps;

public class College {  //parent
    String dep;
    String cname;
    String staff;
    int stud;
    Student student;

   public College(Student student) {
        this.student = student;
    }



    public void setCname(String cname) {
        this.cname = cname;
    }

    public void student (){
    System.out.println("Name");
}
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public static void dummy() {
        System.out.println("dummy");
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public String getStaff() {
        return staff;
    }

    public void setStaff(String staff) {
        this.staff = staff;
    }

    public int getStud() {
        return stud;
    }

    public void setStud(int stud) {
        this.stud = stud;
    }
}
