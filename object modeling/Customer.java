class Customer {
    String name;
    int accountNumber;
    double balance;

    Customer(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    void viewBalance() {
        System.out.println(name + "'s balance: " + balance);
    }
}

class Bank {
    String bankName;
    List<Customer> customers = new ArrayList<>();

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer c) {
        customers.add(c);
        System.out.println("Account opened for " + c.name + " in " + bankName);
    }
}
