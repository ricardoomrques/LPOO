public class FiguraComposta extends Figura {
    private Figura[] array_figuras;
    public FiguraComposta(Figura[] array_figuras) {
        this.array_figuras = array_figuras;
        addFiguras(array_figuras.length);
    }

    public double getArea() {
        double area = 0;
        for (int i = 0; i < array_figuras.length;i++) {
            area += array_figuras[i].getArea();
        }
        return area;
    }

    public double getPerimetro() {
        double perimetro = 0;
        for (int i = 0; i < array_figuras.length;i++) {
            perimetro += array_figuras[i].getPerimetro();
        }
        return perimetro;
    }

    public Figura[] getArray_figuras() {
        return array_figuras;
    }
}
