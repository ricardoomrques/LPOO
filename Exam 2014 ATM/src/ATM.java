public class ATM {
    private int id;
    private String city;
    private String bank;
    public ATM (int id, String city, String bank) {
        this.id = id;
        this.city = city;
        this.bank = bank;
    }

    public int getID() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getBank() {
        return bank;
    }
}
