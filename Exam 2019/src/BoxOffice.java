import java.util.ArrayList;
import java.util.List;

public class BoxOffice {
    public static List<Ticket> buy(Concert concert, int number) throws InvalidTicket {
        List<Ticket> temp = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            concert.setId();
            temp.add(new Ticket(concert.getId(),concert));
        }
        return temp;
    }
}
