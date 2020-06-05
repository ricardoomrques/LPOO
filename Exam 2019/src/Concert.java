import java.util.*;

public class Concert {
    private String city;
    private String country;
    private String date;
    private List<Act> acts;
    private int id = 0;
    public Concert (String city, String country, String date) {
        this.city = city;
        this.country = country;
        this.date = date;
        acts = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id++;
    }

    void addAct(Act act) {
        acts.add(act);
    }

    List<Act> getActs() {
        return acts;
    }

    String getCity() {
        return city;
    }
    String getCountry() {
        return country;
    }
    String getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        // self check
        if (this == o)
            return true;
        // null check
        if (o == null)
            return false;
        // type check and cast
        if (getClass() != o.getClass())
            return false;
        Concert c1 = (Concert) o;
        // field comparison
        return Objects.equals(city, c1.city)
                && Objects.equals(country, c1.country)
                && Objects.equals(date, c1.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city, date);
    }

    Boolean isValid(Ticket t1) {
        if (t1.getConcert().equals(this)) return true;
        return false;
    }

    Boolean participates(Artist artist) {
        for (int i = 0; i < acts.size();i++) {
            if (acts.get(i) instanceof Band && ((Band) acts.get(i)).getArtists().contains(artist)) return true;
            else if (acts.get(i).equals(artist)) return true;
        }
        return false;
    }

}
