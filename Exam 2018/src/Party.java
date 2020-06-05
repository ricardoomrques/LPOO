import java.util.ArrayList;
import java.util.List;

public class Party extends Event {
    List<Event> events = new ArrayList<>();
    public Party(String title, String date, String description) {
        super(title,date,description);
    }
    public void addEvent(Event e) {
        events.add(e);
    }

    public int getAudienceCount() {
        int result = 0;
        for (int i = 0; i < events.size();i++ ) {
            result += events.get(i).persons.size();
        }
        result += persons.size();
        return result;
    }
}
