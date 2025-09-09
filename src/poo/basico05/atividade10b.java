package poo.basico05;

public class atividade10b {

    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;

    public atividade10b(String tipo, double valor, double quantidade) {
        this.tipoCombustivel = tipo;
        this.valorLitro = valor;
        this.quantidadeCombustivel = quantidade;
    }

    public void abastecerPorValor(double valor) {
        double litrosColocados = valor / this.valorLitro;
        this.quantidadeCombustivel -= litrosColocados;
        System.out.println("Foram colocados litros no veículo."+ litrosColocados);
    }

    public void abastecerPorLitro(double litros) {
        double valorAPagar = litros * this.valorLitro;
        this.quantidadeCombustivel -= litros;
        System.out.println("O valor a ser pago é: R$ "+ valorAPagar);
    }

    public void alterarValor(double novoValor) {
        this.valorLitro = novoValor;
    }

    public void alterarCombustivel(String novoTipo) {
        this.tipoCombustivel = novoTipo;
    }

    public void alterarQuantidadeCombustivel(double novaQuantidade) {
        this.quantidadeCombustivel = novaQuantidade;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public double getValorLitro() {
        return valorLitro;
    }

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }
}