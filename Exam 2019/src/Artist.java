import java.util.Objects;

public class Artist extends Act {
    private String name;
    private String country;
    public Artist(String name, String country) {
        this.name = name;
        this.country = country;
    }
    String getName() {
        return name;
    }
    String getCountry() {
        return country;
    }

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
        Artist a1 = (Artist) o;
        // field comparison
        return Objects.equals(name, a1.name)
                && Objects.equals(country, a1.country);
    }
}
