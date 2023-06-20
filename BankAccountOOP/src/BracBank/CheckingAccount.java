package BracBank;
import BracBank.BankAccounts;

public class CheckingAccount extends BankAccounts {
    private double overdraftLimit;

    @Override
    void withdraw(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            super.withdraw(amount);
        } else {
            System.out.println("Insufficient funds >> check overDraft limit");
        }
    }
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

}
