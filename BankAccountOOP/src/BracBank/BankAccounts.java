package BracBank;
import java.util.ArrayList;
import java.util.List;

public class BankAccounts {
    private int accountNum;
    private String accountName;
    private double balance;
    private List<Transaction> transactions;

    public BankAccounts() {
        transactions = new ArrayList<>();
    }
    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void createAccount(int accountNum, String accountName) {
        this.accountNum = accountNum;
        this.accountName = accountName;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            transactions.add(new Transaction("Deposit", amount));
        }else {
            System.out.println("Error Deposit");
        }
    }

    void withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
            transactions.add(new Transaction("Withdraw", amount));
        }
        else {
            System.out.println("Insufficient amount to withdraw -- Current Balance: " + balance);
        }
    }

    public void printStatement() {
        System.out.println("*** Account Statement for " + accountName + " (Account Number: " + accountNum + ") ***");
        System.out.println("Current Balance: " + balance);
        System.out.println("Transaction History:");
//        System.out.println(transactions);
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
