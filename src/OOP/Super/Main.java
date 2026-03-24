package OOP.Super;

public class Main {
    static void main(String[] args) {
    Person person1 = new Person("Harry", "Potter");
    Student student1 = new Student("Draco", "Malfoy", 2.51);
    Employee employee1 = new Employee("Rubeus", "Hagrid", 5_000);

    person1.showName();
    student1.showName();
    student1.showGPA();

    employee1.showSalary();
    }
}


