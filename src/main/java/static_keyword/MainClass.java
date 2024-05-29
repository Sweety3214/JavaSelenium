package static_keyword;

public class MainClass {

    public static void main(String[] args) {

        SunRisers sunRisers1 = new SunRisers();
        sunRisers1.normalVariable = 123;
        System.out.println(sunRisers1.normalVariable); //Address1

        SunRisers sunRisers2 = new SunRisers();
        System.out.println(sunRisers2.normalVariable); //Address2

        SunRisers.staticVariable = 666;
        System.out.println(SunRisers.staticVariable); //StaticAddress3

        SunRisers.staticVariable = 5443;
        System.out.println(SunRisers.staticVariable);

    }

}
