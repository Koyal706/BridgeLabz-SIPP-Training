class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String acc, double bal) {
        this.accountNumber = acc;
        this.balance = bal;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String acc, double bal, double rate) {
        super(acc, bal);
        this.interestRate = rate;
    }

    void displayAccountType() {
        System.out.println("Savings Account");
    }
}

class CheckingAccount extends BankAccount {
    int withdrawalLimit;

    CheckingAccount(String acc, double bal, int limit) {
        super(acc, bal);
        this.withdrawalLimit = limit;
    }

    void displayAccountType() {
        System.out.println("Checking Account");
    }
}

class FixedDepositAccount extends BankAccount {
    int lockInPeriod;

    FixedDepositAccount(String acc, double bal, int period) {
        super(acc, bal);
        this.lockInPeriod = period;
    }

    void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}
