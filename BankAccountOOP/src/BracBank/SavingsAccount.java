package BracBank;
import BracBank.BankAccounts;
public class SavingsAccount extends BankAccounts {
    private double interestRate;
    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                '}';
    }
}
