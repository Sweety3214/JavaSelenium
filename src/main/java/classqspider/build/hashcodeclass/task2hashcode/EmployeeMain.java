package classqspider.build.hashcodeclass.task2hashcode;

public class EmployeeMain {
    public static void main(String[] args) {
        ITEmployee itEmployee=new ITEmployee("Sweety","Sweety203", 50000);
        ITEmployee itEmployee1=new ITEmployee("Sweety","Sweety203", 50000);

      boolean isObjEquals=(itEmployee.equals(itEmployee1));
        System.out.println(isObjEquals);

        System.out.println(itEmployee.toString());
        System.out.println(itEmployee.hashCode());

        System.out.println(itEmployee1.toString());
        System.out.println(itEmployee1.hashCode());

    }
}
