import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    public List<Room> authorized_rooms = new ArrayList<>();
    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        User u = (User) obj;
        return this.name.equals(u.name);
    }
}
