package classqspider.qspider.oops.relationShip.ex2;

public class House {
    private String houseColor;
     private int floor;

     private Members members;

    public House(String houseColor, int floor, Members members) {
        this.houseColor = houseColor;
        this.floor = floor;
        this.members = members;
    }

    public House() {
    }

    public String getHouseColor() {
        return houseColor;
    }

    public void setHouseColor(String houseColor) {
        this.houseColor = houseColor;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Members getMembers() {
        return members;
    }

    public void setMembers(Members members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseColor='" + houseColor + '\'' +
                ", floor=" + floor +
                ", members=" + members +
                '}';
    }
}
