class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(int number, String holder, double balance) {
        this.accountNumber = number;
        this.accountHolder = holder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        this.balance = amount;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(int number, String holder, double balance) {
        super(number, holder, balance);
    }

    public void displayDetails() {
        System.out.println("Account No: " + accountNumber + ", Holder: " + accountHolder);
    }
}
