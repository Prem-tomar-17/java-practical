class Product {

    String name;
    double price;
    int quantity;

    // No-argument Constructor
    Product() {
        name = "Unknown";
        price = 0;
        quantity = 0;
    }

    // Constructor with name
    Product(String name) {
        this.name = name;
        price = 0;
        quantity = 0;
    }

    // Constructor with name and price
    Product(String name, double price) {
        this.name = name;
        this.price = price;
        quantity = 0;
    }

    // Constructor with all fields
    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateTotalCost() {
        return price * quantity;
    }

    void display() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotalCost());
        System.out.println("-------------------");
    }
}

public class Practical8 {
    public static void main(String[] args) {

        Product p1 = new Product();

        Product p2 = new Product("Laptop");

        Product p3 = new Product("Mobile", 15000);

        Product p4 = new Product("Keyboard", 1000, 2);

        p1.display();
        p2.display();
        p3.display();
        p4.display();
    }
}