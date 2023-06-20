package BracBank;

public class Driver {
    public static void main(String[] args) {

        // *** Savings account ***

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.createAccount(2301, "farhan");
        savingsAccount.deposit(300);
        System.out.println("farhan current balance after deposit: " + savingsAccount.getBalance());
        savingsAccount.withdraw(200);
        System.out.println("farhan current balance after withdraw: " + savingsAccount.getBalance());
        savingsAccount.printStatement();

        savingsAccount.setInterestRate(0.05);
        double interest = savingsAccount.calculateInterest();
        System.out.println("Interest for " + savingsAccount.getAccountName() + " for available amount:" + interest);

        System.out.println("--------------------------------------------------------------------------------------");

        // *** Checking account ***

        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.createAccount(2302, "erfan");
        checkingAccount.setOverdraftLimit(500);

        checkingAccount.deposit(500);
        System.out.println("erfan's current balance after deposit : " + checkingAccount.getBalance());
        checkingAccount.withdraw(1200);
        System.out.println("erfan's current balance after withdraw : " + checkingAccount.getBalance());

    }
}

// Create a new bank account (accountNum, accountName)
// Deposit money into an existing account. (amount)
// Withdraw money into an existing account. (amount)
// Check the balance of an existing account. (call getBalance method)
// Print a statement of all transactions for a specific account.

// BankAccount - done
// CheckingAccount
// SavingsAccount
// Transaction - done

// createAccount - done
// deposit - done
// withdraw - done
// getBalance() - done
// printStatement() -
