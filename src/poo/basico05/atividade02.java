package poo.basico05;

public class atividade02 {

    private int numero1;
    private int numero2;

    public void setNumero1(int numero) {
        this.numero1 = numero;
    }

    public int getNumero1() {
        return this.numero1;
    }

    public void setNumero2(int numero) {
        this.numero2 = numero;
    }

    public int getNumero2() {
        return this.numero2;
    }

    public String Intervalo() {
        int inicio = this.numero1;
        int fim = this.numero2;

        if (inicio > fim) {
            System.out.println("O seu número final é maior que o inicial, a ordem será invertida!");
            int temp = inicio;
            inicio = fim;
            fim = temp;
        }

    StringBuilder resultado = new StringBuilder();
        resultado.append("Os números no intervalo de " + inicio + " a " + fim + " são:\n");

        for (int i = inicio; i <= fim; i++) {
            resultado.append(i).append(" ");
        }

        return resultado.toString();
    }
}




