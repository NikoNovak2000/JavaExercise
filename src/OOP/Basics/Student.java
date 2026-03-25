package OOP.Basics;

public class Student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // Constructor
    Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    void study(){
        System.out.println(this.name + "is studying.");
    }
}

// constructor = special method to initialize objects
// you can pass arguments to a constructor and set up initial values