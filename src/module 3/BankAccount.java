package assignment1.partThree;
class BankAccount {

    String accountNumber;
    double balance;

    // Constructor
    BankAccount(String accNo, double initialBalance) {
        accountNumber = accNo;
        balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("ACC123", 5000);

        account.deposit(1000);
        account.withdraw(2000);
        account.displayBalance();
    }
}
