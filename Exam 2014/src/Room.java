import java.util.ArrayList;
import java.util.List;

public class Room extends Facility {
    private Building buil;
    private String number;
    private String name;
    private int capacity;
    private int floor;
    public Room(Building b, String number, int floor) throws DuplicateRoomException {
        if (floor < b.getMinFloor() || floor > b.getMaxFloor()) throw new IllegalArgumentException();
        this.buil = b;
        this.number = number;
        this.name = buil.getName() + number;
        this.floor = floor;
        this.capacity = 0;
        if (rooms.contains(this)) throw new DuplicateRoomException();
        this.rooms.add(this);
    }
    public Room(Building b, String number, int floor, int capacity) {
        if (floor < b.getMinFloor() || floor > b.getMaxFloor()) throw new IllegalArgumentException();
        this.buil = b;
        this.number = number;
        this.name = buil.getName() + number;
        this.floor = floor;
        this.capacity += capacity;
        rooms.add(this);
    }
    public Building getBuilding() {
        return buil;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getFloor() {
        return floor;
    }

    @Override
    public String toString() {
        return "Room(" + this.buil.getName() + "," + this.number + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        Room r = (Room) obj;
        return this.buil.equals(r.buil) && this.number.equals(r.number) && this.floor == r.floor;
    }

    public int getCapacity() {
        return capacity;
    }

    public void authorize(User u) {
        u.authorized_rooms.add(this);
    }

    public Boolean canEnter(User u) {
        if (u.authorized_rooms.contains(this)) return true;
        return false;
    }

}
