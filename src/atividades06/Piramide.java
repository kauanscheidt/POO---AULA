package atividades06;

public class Piramide {

    private double ab;
    private double h;
    private int tipoTinta;

    private static final double RENDIMENTO_M2_POR_LITRO = 4.76;
    private static final double LITROS_POR_LATA = 18;
    private static final double PRECO_TIPO_1 = 127.90;
    private static final double PRECO_TIPO_2 = 258.98;
    private static final double PRECO_TIPO_3 = 344.34;

    public Piramide(double ab, double h, int tipoTinta) {
        this.ab = ab;
        this.h = h;
        this.tipoTinta = tipoTinta;
    }

    public double getAb() {
        return ab; }

    public double getH() {
        return h; }
    public int getTipoTinta() {
        return tipoTinta; }


    public double getAl() {
        return Math.sqrt(Math.pow(h, 2) + Math.pow(ab, 2));
    }

    private double getLadoBase() {
        return 2 * ab;
    }

    public double getAreaBase() {
        return Math.pow(getLadoBase(), 2);
    }

    public double getAreaTriangulo() {
        return (getLadoBase() * getAl()) / 2;
    }

    public double getAreaTotal() {
        return getAreaBase() + (4 * getAreaTriangulo());
    }

    public double getLitros() {
        return getAreaTotal() / RENDIMENTO_M2_POR_LITRO;
    }

    public long getLatas() {
        return (long) Math.ceil(getLitros() / LITROS_POR_LATA);
    }

    public double getPrecoTotal() {
        double precoPorLata = 0;
        switch (tipoTinta) {
            case 1: precoPorLata = PRECO_TIPO_1; break;
            case 2: precoPorLata = PRECO_TIPO_2; break;
            case 3: precoPorLata = PRECO_TIPO_3; break;
        }
        return getLatas() * precoPorLata;
    }

    public double getVolume() {
        return (getAreaBase() * h) / 3.0;
    }

    @Override
    public String toString() {
        return "ab: " + getAb() + "\n" +
                "h: " + getH() + "\n" +
                "al: " + getAl() + "\n" +
                "Área Triângulo: " + getAreaTriangulo() + "\n" +
                "Área Base: " + getAreaBase() + "\n" +
                "Área Total: " + getAreaTotal() + "\n" +
                "Tipo de Tinta: " + getTipoTinta() + "\n" +
                "Litros: " + getLitros() + "\n" +
                "Latas: " + getLatas() + "\n" +
                "Preço: " + String.format("%.2f", getPrecoTotal()) + "\n" +
                "Volume: " + getVolume();
    }
}