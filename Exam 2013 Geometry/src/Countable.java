public class Countable {
    private int num_figuras = 0;

    public void addFiguras(int size) {
        num_figuras += size;
    }

    public int count() {
        return num_figuras;
    }
}
