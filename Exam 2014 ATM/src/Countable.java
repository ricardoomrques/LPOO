import java.util.ArrayList;
import java.util.List;

public class Countable {
    public static List<Transaction> transactions = new ArrayList<>();

    public int count() {
        return transactions.size();
    }
}
