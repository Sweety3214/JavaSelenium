package classqspider.qspider.oops.relationShip.hasACollegeEncaps;

public class Details {
    public static void main(String[] args) {
        Student student = new Student();
        College college = new College(new Student());  //calling directly from class a
      //  System.out.println(college.getStudent());
       // college.setStudent();
        // college.student();
        college.dummy();

        college.setDep("ECE");
        college.setStaff("Hundred");
        college.setStud(5000);

        System.out.println(college.getDep());


        student.setGirls("2Tho");
        student.setBoys("25000");

        System.out.println(student.getCollege().getDep());   // calling from class a to b

        System.out.println(student.getGirls());
    }
}
