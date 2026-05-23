import java.util.ArrayList;
class BankAccount {
    private String accountHolder;
    private double balance;
    private ArrayList<String> transactions;
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        transactions = new ArrayList<>();
    }
    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            transactions.add("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance or Invalid Amount");
        }
    }

    public double getBalance() {
        return balance;
    }

   
    public void showTransactions() {

        System.out.println("\nTransaction History:");

        for (String t : transactions) {
            System.out.println(t);
        }
    }
}

public class BankManagement {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("John", 1000);

        account.deposit(500);

        account.withdraw(300);

        System.out.println("Current Balance: " + account.getBalance());

        account.showTransactions();
    }
}