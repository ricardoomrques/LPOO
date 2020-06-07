import java.util.ArrayList;
import java.util.List;

public class Facility {
    private String name;
    public static List<Room> rooms = new ArrayList<>();
    public String getName() {
        return name;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public int getCapacity() {
        int result = 0;
        for (int i = 0; i < this.getRooms().size();i++) {
            System.out.println(this.getRooms().get(i).getCapacity());
            result += this.getRooms().get(i).getCapacity();
        }
        return result;
    }

    public Boolean canEnter(User u) {
        for (int i = 0; i < u.authorized_rooms.size();i++) {
            if (u.authorized_rooms.get(i).getBuilding().equals(this)) return true;
        }
        return false;
    }
}
