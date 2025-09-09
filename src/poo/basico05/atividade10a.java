package poo.basico05;

public class atividade10a {

        private String tipoCombustivel;
        private double valorLitro;
        private double quantidadeCombustivel;

        public atividade10a(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
            this.tipoCombustivel = tipoCombustivel;
            this.valorLitro = valorLitro;
            this.quantidadeCombustivel = quantidadeCombustivel;
        }

        public void abastecerPorValor(double valor) {
            double litrosAbastecidos = valor / this.valorLitro;
            this.quantidadeCombustivel -= litrosAbastecidos;
        }

        public void abastecerPorLitro(double litros) {
            this.quantidadeCombustivel -= litros;
        }

        public void setValorLitro(double novoValor) {
            this.valorLitro = novoValor;
        }

        public void setTipoCombustivel(String novoTipo) {
            this.tipoCombustivel = novoTipo;
        }

        public void reabastecerBomba(double quantidade) {
            this.quantidadeCombustivel += quantidade;
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
