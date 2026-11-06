interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

// Multiple Inheritance using Interfaces
class AllInOnePrinter implements Printable, Scannable {

    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }
}

// Hybrid Inheritance
class Machine {
    void start() {
        System.out.println("Machine started");
    }
}

class Computer extends Machine implements Printable {

    public void print() {
        System.out.println("Computer is printing");
    }
}

public class Practical3 {
    public static void main(String[] args) {

        System.out.println("Multiple Inheritance:");

        AllInOnePrinter printer = new AllInOnePrinter();
        printer.print();
        printer.scan();

        System.out.println("\nHybrid Inheritance:");

        Computer computer = new Computer();
        computer.start();
        computer.print();
    }
}