package classqspider.qspider.oops.relationShip.hasACollegeEncaps;

public class Details {
    public static void main(String[] args) {
        College college = new College();  //calling directly from class a
        college.dummy();
        college.setDep("ECE");
        college.setStaff("Hundred");
        college.setStud(5000);

        System.out.println(college.getDep());

        Student student = new Student();

        student.setGirls("2Tho");
        student.setBoys("25000");

        System.out.println(student.getCollege().getDep());   // calling from class a to b

        System.out.println(student.getGirls());
    }
}
