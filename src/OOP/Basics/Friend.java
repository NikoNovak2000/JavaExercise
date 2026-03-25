package OOP.Basics;

public class Friend {

    String name;
    static int numOfFriends;

    Friend(String name){
        this.name = name;
        numOfFriends++;
    }

    static void showFriends(){
        System.out.println("You have " + numOfFriends + " total friends!");
    }
}

// static = makes a variable or method belong to the class rather than to any specific object.
// Commonly used for utility methods or shared resources.