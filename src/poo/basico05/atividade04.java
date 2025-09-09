package poo.basico05;

public class atividade04 {

    private double ganhoHora;
    private double horasTotal;

    final private double PERCENTUAL_INSS = 0.11;
    final private double PERCENTUAL_IR = 0.08;
    final private double PERCENTUAL_SINDICATO = 0.05;

    public double getGanhoHora() {
        return ganhoHora;
    }

    public void setGanhoHora(double ganhoHora) {
        this.ganhoHora = ganhoHora;
    }

    public double getHorasTotal() {
        return horasTotal;
    }


    public void setHorasTotal(double horasTotal) {
        this.horasTotal = horasTotal;
    }

    public double SalarioBruto() {
        return this.ganhoHora * this.horasTotal;
    }

    public double valorDescontoINSS() {
        return SalarioBruto() * this.PERCENTUAL_INSS;
    }

    public double valorDescontoIR() {
        return SalarioBruto() * this.PERCENTUAL_IR;
    }

    public double valorDescontoSINDICATO() {
        return SalarioBruto() * this.PERCENTUAL_SINDICATO;
    }

    public double totalDesconto() {
        return valorDescontoIR() + valorDescontoSINDICATO() + valorDescontoINSS();
    }

    public double SalarioLiquido() {
        return SalarioBruto() - totalDesconto();
    }
}

