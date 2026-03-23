public class Main {
    static void main(String[] args) {
        int temperature = 30;

        if (temperature > 30) {
            System.out.println("It's a hot day.");
            System.out.println("Drink more water.");
        }
        else if (temperature > 20) {
            System.out.println("It's a nice day.");
        }
        else {
            System.out.println("It's a cold day.");
        }
    }
}