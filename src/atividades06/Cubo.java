package atividades06;

public class Cubo {

    private double lado;
    private double rendimentoTinta;
    private int tipoTinta;

    private static final double PRECO_TIPO_1 = 101.90;
    private static final double PRECO_TIPO_2 = 212.45;
    private static final double PRECO_TIPO_3 = 345.56;
    private static final double LITROS_POR_LATA = 18;
    private static final int QUANTIDADE_LADOS = 6;

    public Cubo(double lado, double rendimentoTinta, int tipoTinta) {
        this.lado = lado;
        this.rendimentoTinta = rendimentoTinta;
        this.tipoTinta = tipoTinta;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getRendimentoTinta() {
        return rendimentoTinta;
    }

    public void setRendimentoTinta(double rendimentoTinta) {
        this.rendimentoTinta = rendimentoTinta;
    }

    public double getTipoTinta() {
        return tipoTinta;
    }

    public void setTipoTinta(int tipoTinta) {
        this.tipoTinta = tipoTinta;
    }

    public double getAreaBase() {
        return lado * lado;
    }

    public double getAreaTotal() {
        return getAreaBase() * QUANTIDADE_LADOS;
    }

    public double getVolumeCubo() {
        return Math.pow(lado, 3);
    }

    public double getDiagonalCubo() {
        return lado * Math.sqrt(3);
    }

    public double getLitros() {
        return getAreaTotal() * rendimentoTinta;
    }

    public double getLatas() {
        double latasNecessarias = getLitros() / LITROS_POR_LATA;
        return (long) Math.ceil(latasNecessarias);
    }

    public double getPrecoTotal() {
        double precoLata = 0;
        switch (tipoTinta) {
            case 1:
                precoLata = PRECO_TIPO_1;
                break;
            case 2:
                precoLata = PRECO_TIPO_2;
                break;
            case 3:
                precoLata = PRECO_TIPO_3;
                break;
        }
        return getLatas() * precoLata;
    }

    public String toString() {
        return "--- DADOS DO CUBO ---\n" +
                "Lado: " + getLado() + " m\n" +
                "Área da Base: " + String.format("%.2f", getAreaBase()) + " m²\n" +
                "Área Total: " + String.format("%.2f", getAreaTotal()) + " m²\n" +
                "Volume: " + String.format("%.2f", getVolumeCubo()) + " m³\n" +
                "Diagonal: " + String.format("%.2f", getDiagonalCubo()) + " m\n\n" +
                "--- CÁLCULO DE PINTURA ---\n" +
                "Tipo de Tinta: " + getTipoTinta() + "\n" +
                "Rendimento: " + getRendimentoTinta() + " L/m²\n" +
                "Litros necessários: " + String.format("%.2f", getLitros()) + " L\n" +
                "Latas a comprar: " + String.format("%.0f", getLatas()) + " lata(s)\n" +
                "Preço Total: R$ " + String.format("%.2f", getPrecoTotal());
    }
}

