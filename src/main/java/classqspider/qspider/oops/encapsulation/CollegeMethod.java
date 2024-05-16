package classqspider.qspider.oops.encapsulation;

public class CollegeMethod {
    public static void main(String[] args) {
        School school = new School();
        school.setStd(12);
        school.setMark(801);
        school.setSub("BIO");

        System.out.println(school.getStd());
        System.out.println(school.getMark());
        System.out.println(school.getSub());
    }
}
