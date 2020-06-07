public class Deposit extends Transaction {
    private ATM atm;
    private Session session;
    private Card card;
    private int number;
    public Deposit(ATM atm, Session session, Card card, int number) {
        this.atm = atm;
        this.session = session;
        this.card = card;
        this.number = number;
    }
}
