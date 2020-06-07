public class Session extends Countable{
    private ATM atm;
    public Session(ATM atm) {
        this.atm = atm;
    }

    public ATM getATM() {
        return atm;
    }

    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        Session s = (Session) obj;
        return this.atm.getID() == s.atm.getID() && this.atm.getBank().equals(s.atm.getBank()) && this.atm.getCity().equals(s.atm.getCity());
    }
}
