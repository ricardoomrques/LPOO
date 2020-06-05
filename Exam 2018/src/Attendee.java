public class Attendee extends Person {
    private String paid;
    public Attendee(String name) {
        super(name);
        this.paid = "hasn't";
    }
    public Attendee(String name, int age) {
        super(name,age);
        this.paid = "hasn't";
        setUsername(name + age);
    }

    public Boolean hasPaid() {
        if (paid.equals("hasn't")) return false;
        return true;
    }

    @Override
    public String toString() {
        return "Attendee " + this.getName() + (this.hasPaid() ? " has" : " hasn't") + " paid its registration.";
    }

}
