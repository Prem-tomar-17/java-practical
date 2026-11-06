class Employee {

    String name;
    double salary;

    static int count = 0;

    // No-argument Constructor
    Employee() {
        this("Unknown", 0);
    }

    // Parameterized Constructor
    Employee(String name, double salary) {

        this.name = name;
        this.salary = salary;

        count++;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    static void displayCount() {
        System.out.println("Total Employees: " + count);
    }
}

public class Practical9 {
    public static void main(String[] args) {

        Employee e1 = new Employee();

        Employee e2 = new Employee("Rahul", 30000);

        Employee e3 = new Employee("Aman", 40000);

        e1.display();
        e2.display();
        e3.display();

        Employee.displayCount();
    }
}