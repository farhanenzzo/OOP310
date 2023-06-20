package BracBank;
import java.util.Date;

public class Transaction {
    private Date date;
    private String type;  // (deposit or withdrawal)
    private double amount;
    private double balanceAfterTran; // current balance

    public Transaction(String type, double amount) {
        this.date = new Date();
        this.type = type;
        this.amount = amount;
        this.balanceAfterTran = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalanceAfterTran() {
        return balanceAfterTran;
    }

    public void setBalanceAfterTran(double balanceAfterTran) {
        this.balanceAfterTran = balanceAfterTran;
    }


    @Override
    public String toString() {
        return "Transaction{" +
                "date=" + date +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", balanceAfterTran=" + balanceAfterTran +
                '}';
    }
}
