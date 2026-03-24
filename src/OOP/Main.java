package OOP;

public class Main {
    static void main(String[] args) {

        Friend friend1 = new Friend("Finn");
        Friend friend2 = new Friend("Hector");
        Friend friend3 = new Friend("Kenny");
        Friend friend4 = new Friend("Mandy");

        System.out.println(Friend.numOfFriends);
        Friend.showFriends();
    }
}
