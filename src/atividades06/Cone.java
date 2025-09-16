package atividades06;

public class Cone {

    private double raio;
    private double altura;
    private int tipoTinta;


    private static final double PI = 3.14;
    private static final double RENDIMENTO_LITRO_M2 = 3.45;
    private static final double LITROS_POR_LATA = 18;
    private static final double PRECO_TIPO_1 = 238.90;
    private static final double PRECO_TIPO_2 = 467.98;
    private static final double PRECO_TIPO_3 = 758.34;

    public Cone(double raio, double altura, int tipoTinta) {
        this.raio = raio;
        this.altura = altura;
        this.tipoTinta = tipoTinta;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getTipoTinta() {
        return tipoTinta;
    }

    public void setTipoTinta(int tipoTinta) {
        this.tipoTinta = tipoTinta;
    }

    public double getGeratriz() {
        return Math.sqrt(Math.pow(raio, 2) + Math.pow(altura, 2));
    }

    public double getAreaFundo() {
        return PI * Math.pow(raio, 2);
    }

    public double getAreaLateral() {
        return PI * raio * getGeratriz();
    }

    public double getAreaTotal() {
        return getAreaFundo() + getAreaLateral();
    }

    public double getLitros() {
        return getAreaTotal() * RENDIMENTO_LITRO_M2;
    }

    public long getLatas() {
        double latasNecessarias = getLitros() / LITROS_POR_LATA;
        return (long) Math.ceil(latasNecessarias);
    }

    public double getPrecoTotal() {
        double precoPorLata = 0;
        switch (tipoTinta) {
            case 1:
                precoPorLata = PRECO_TIPO_1;
                break;
            case 2:
                precoPorLata = PRECO_TIPO_2;
                break;
            case 3:
                precoPorLata = PRECO_TIPO_3;
                break;
        }
        return getLatas() * precoPorLata;
    }

    public String toString() {
        return "Cone\n" +
                "Raio: " + getRaio() + "\n" +
                "Altura: " + getAltura() + "\n" +
                "Nível: " + getTipoTinta() + "\n" +
                "Geratriz: " + getGeratriz() + "\n" +
                "Área do Fundo: " + getAreaFundo() + "\n" +
                "Área Lateral Cone: " + getAreaLateral() + "\n" +
                "Área Total: " + getAreaTotal() + "\n" +
                "Litros: " + getLitros() + "\n" +
                "Latas: " + getLatas() + "\n" +
                "Preço Total: " + getPrecoTotal();
    }
}