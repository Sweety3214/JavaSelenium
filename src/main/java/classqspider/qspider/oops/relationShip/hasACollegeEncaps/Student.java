package classqspider.qspider.oops.relationShip.hasACollegeEncaps;

public class Student {
    String girls;
    String boys;
    String gName;
    String bName;
    College college = new College();

    public String getGirls() {
        return girls;
    }

    public void setGirls(String girls) {
        this.girls = girls;
    }

    public String getBoys() {
        return boys;
    }

    public void setBoys(String boys) {
        this.boys = boys;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

}
