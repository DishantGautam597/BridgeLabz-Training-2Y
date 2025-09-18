class BankAccount {
    static String bankName = "ABC Bank";
    static int totalAccounts = 0;
    final int accountNumber;
    String accountHolderName;

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName + ", Name: " + accountHolderName + ", Account No: " + accountNumber);
        }
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("John", 101);
        BankAccount b2 = new BankAccount("Alice", 102);
        b1.displayDetails();
        b2.displayDetails();
        BankAccount.getTotalAccounts();
    }
}