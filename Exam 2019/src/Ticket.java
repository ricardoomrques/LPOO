import java.util.Objects;

public class Ticket {
    private int number;
    private Concert concert;
    public Ticket(int number, Concert concert) throws InvalidTicket {
        if (number < 0) throw new InvalidTicket();
        this.number = number;
        this.concert = concert;
    }

    int getNumber() {
        return number;
    }
    Concert getConcert() {
        return concert;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number,concert);
    }

}
