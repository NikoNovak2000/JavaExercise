package OOP;

public class Main {
    static void main(String[] args) {

        User user1 = new User("Hank");
        User user2 = new User("Patrick", "patrickstar@gmail.com");
        User user3 = new User("Syndra", "jamesyndra@gmail.com");
        User user4 = new User();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
    }
}
