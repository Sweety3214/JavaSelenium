package classqspider.qspider.oops.relationShip.ex2;

public class MembersDetails {

    public static void main(String[] args) {
     House house= setHouseDeatilUsingSetter();
        System.out.println(house);
        House house1=setHouseDeatilsUsingConstrutor();
        System.out.println(house1);
    }

    private static House setHouseDeatilsUsingConstrutor() {
        Members members=new Members(4, "Jo");
        House house=new House("PINK",3, members);
        return house;
    }


    private static House setHouseDeatilUsingSetter() {
        Members members=new Members();
        members.setNameOfMembers("Banu");
        members.setNoOfMembers(2);

        House house1=new House();
        house1.setHouseColor("WHITE");
        house1.setFloor(3);
        house1.setMembers(members);
        return house1;
    }
}
//setHouseDeatilUsingSetter();