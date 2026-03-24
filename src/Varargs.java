public class Varargs {
    static void main(String[] args) {
        // varargs allow a method to accept a varying number of arguments, makes methode more flexible, no need for overloaded methods
        // it usees three dots ... --> ellipsis

        System.out.println(add(1, 2, 3, 4));

        System.out.println(average(0));
    }

    static int add(int... numbers){

        int sum = 0;

        for(int number : numbers) {
            sum += number;
        }

        return sum;
    }

    static double average(double... numbers){
        double result = 0;

        if(numbers.length == 0){
            return 0;
        }

        for (double number : numbers) {
            result += number;
        }

        return result / numbers.length;
    }
}

