public class Circulo extends Figura {
    private Ponto centro;
    private int raio;
    public Circulo (Ponto c, int raio) {
        if (raio <= 0) throw new IllegalArgumentException();
        this.centro = c;
        this.raio = raio;
    }

    public Ponto getCentro() {
        return centro;
    }

    public int getRaio() {
        return raio;
    }

    public double getArea() {
        return Math.PI * Math.pow(raio,2);
    };

    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }
}
