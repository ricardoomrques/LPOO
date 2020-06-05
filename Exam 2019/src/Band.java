import java.util.ArrayList;
import java.util.List;

public class Band extends Act {
    private String name;
    private String country;
    List<Artist> artists;
    public Band(String name, String country) {
        this.name = name;
        this.country = country;
        artists = new ArrayList<>();
    }
    String getName() {
        return name;
    }
    String getCountry() {
        return country;
    }

    void addArtist(Artist artist) {
        artists.add(artist);
    }

    List<Artist> getArtists() {
        return artists;
    }

    Boolean containsArtist(Artist artist) {
        for (int i = 0; i < artists.size();i++) {
            if (artists.get(i).equals(artist)) return true;
        }
        return false;
    }
}
