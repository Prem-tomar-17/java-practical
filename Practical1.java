class Student {
    int rollNo;
    String name;
    int marks1, marks2, marks3;

    // Constructor
    Student(int rollNo, String name, int m1, int m2, int m3) {
        this.rollNo = rollNo;
        this.name = name;
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    // Calculate total marks
    int calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    // Calculate percentage
    double calculatePercentage() {
        return calculateTotal() / 3.0;
    }

    // Display student details
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("----------------------");
    }
}

public class Practical1 {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Rahul", 85, 90, 80);
        Student s2 = new Student(102, "Aman", 75, 80, 85);
        Student s3 = new Student(103, "Priya", 90, 95, 92);

        s1.display();
        s2.display();
        s3.display();
    }
}