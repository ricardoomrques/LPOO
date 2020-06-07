public class Ponto implements Comparable {
    private int x;
    private int y;
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        Ponto p = (Ponto) obj;
        return p.x == this.x && p.y == this.y;
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    @Override
    public int compareTo(Object o) {
        Ponto p = (Ponto) o;
        if (p.getX() != this.getX()) return this.getX() - p.getX();
        else return this.getY() - p.getY();
    }
}
