interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) balance -= amount;
    }

    public abstract double calculateInterest();

    public void displayAccount() {
        System.out.println("Account: " + accountNumber + ", Holder: " + holderName + ", Balance: ₹" + balance);
    }
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String acc, String name, double bal) {
        super(acc, name, bal);
    }

    public double calculateInterest() {
        return getBalance() * 0.04;
    }

    public void applyForLoan(double amount) {
        System.out.println("Savings Account: Loan applied for ₹" + amount);
    }

    public boolean calculateLoanEligibility() {
        return getBalance() >= 5000;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String acc, String name, double bal) {
        super(acc, name, bal);
    }

    public double calculateInterest() {
        return 0; // No interest
    }

    public void applyForLoan(double amount) {
        System.out.println("Current Account: Loan applied for ₹" + amount);
    }

    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount("SB123", "Alice", 8000),
            new CurrentAccount("CA456", "Bob", 15000)
        };

        for (BankAccount acc : accounts) {
            acc.displayAccount();
            System.out.println("Interest: ₹" + acc.calculateInterest());
            ((Loanable)acc).applyForLoan(50000);
            System.out.println("Loan Eligibility: " + ((Loanable)acc).calculateLoanEligibility());
            System.out.println("---------------------------");
        }
    }
}
