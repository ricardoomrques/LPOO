import java.text.DecimalFormat;

public class Withdrawal extends Transaction {
    private ATM atm;
    private Session session;
    private Card card;
    private int number;
    private double amount;
    public Withdrawal(ATM atm, Session session, Card card, int number) {
        this.atm = atm;
        this.session = session;
        this.card = card;
        this.number = number;
        this.amount = 0;
    }

    public void setAmount(double ammount) {
        this.amount += ammount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Withdrawal at ATM " + this.atm.getID() + " (" + this.atm.getCity() + ", " + this.atm.getBank() + ") of " + this.amount + "0";
    }
}
