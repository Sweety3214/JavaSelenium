package classqspider.build.hashcodeclass.taskhascode;

public class SchoolMain {
    public static void main(String[] args) {
        School school=new School("NVKS","Chennai",2000); //addres1
        School school1=new School("NVKS","Chennai",2000); //add2

        System.out.println(school.toString());    // return a String representation of object
        System.out.println(school.hashCode());   // return a hashcode for object

        System.out.println(school1.toString());
        System.out.println(school1.hashCode());


        boolean isObjEqual=(school.equals(school1)); //true    // it will give true means ture false means false because we genarate equal method and we give .equals()
        System.out.println(isObjEqual);               // if we give .equal and override from object class(pre defined class)and check the address give true   or if we give .equal without override then it check the hasscode of object and give false

        boolean isObjEqualTo=(school==school1); //false     //  it will always give false even we over riding it will check only the hashcode of  ob because we give ==
        System.out.println(isObjEqualTo);

        boolean isObjEqualTo1=(school==school);   //true --hascode is same //  it will always give false even we over riding it will check only the hashcode of  ob because we give ==
        System.out.println(isObjEqualTo1);


      School school2=new School("NM","KK",2000); //addres1
        School school3=new School("MACET","MARTHANDAM",2000); //add2

        boolean isObjEqual2=(school2.equals(school3));   //false
        System.out.println(isObjEqual2);




    }
}
