class BankAccount {

    private String accountHolder;
    private String accountNumber;
    private double balance;

    BankAccount(String accountHolder, String accountNumber, double balance) {

        this.accountHolder = accountHolder;

        this.accountNumber = accountNumber;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    // Getters
    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit Method
    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful: " + amount);
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount");
        }
        else if (amount > balance) {
            System.out.println("Insufficient Balance");
        }
        else {
            balance -= amount;
            System.out.println("Withdrawal Successful: " + amount);
        }
    }

    void display() {
        System.out.println("\nAccount Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Available Balance: " + balance);
    }
}

public class Practical10 {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(
            "Rahul",
            "1234567890",
            10000
        );

        account.display();

        System.out.println("\nTransactions:");

        account.deposit(5000);

        account.deposit(-500);

        account.withdraw(2000);

        account.withdraw(-100);

        account.withdraw(20000);

        System.out.println("\nFinal Account Details:");

        account.display();
    }
}