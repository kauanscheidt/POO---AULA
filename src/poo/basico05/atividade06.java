package poo.basico05;

public class atividade06 {

    private double lado;

    public void setLado(double novoLado) {
        if (novoLado > 0) {
            this.lado = novoLado;
        }
    }

    public double getLado() {
        return this.lado;
    }

    public double calcularArea() {
        return this.lado * this.lado;
    }
}