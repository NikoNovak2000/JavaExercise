package OOP;

public class Main {
    static void main(String[] args) {
        Student student1 = new Student("Spongebob", 30, 3.2);
        Student student2 = new Student("Patrick", 29, 2.2);
        Student student3 = new Student("Squidward", 56, 4.1);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);


        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);

        student1.study();
        student2.study();
        student3.study();
    }
}
