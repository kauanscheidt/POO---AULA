package poo.basico05;

public class atividade03 {

    private double num1;
    private double num2;

    public double getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public double somar() {
        return this.num1 + this.num2;
    }

    public double subtrair() {
        return this.num1 - this.num2;
    }

    public double multiplicar() {
        return this.num1 * this.num2;
    }

    public double dividir() {
        if (this.num2 == 0) {
            return 0;
        }
        return this.num1 / this.num2;
    }
}
