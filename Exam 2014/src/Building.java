public class Building extends Facility {
    private String name;
    private int min;
    private int max;
    public Building(String name, int min, int max) {
        if (min > max) throw new IllegalArgumentException();
        this.name = name;
        this.min = min;
        this.max = max;
    }

    public String getName() {
        return name;
    }

    public int getMinFloor() {
        return min;
    }

    public int getMaxFloor() {
        return max;
    }

    public int getCapacity() {
        int result = 0;
        for (int i = 0; i < this.rooms.size();i++) {
            result += this.rooms.get(i).getCapacity();
        }
        return result;
    }

    @Override
    public String toString() {
        return "Building(" + this.name + ")";
    }
}
