package poo.basico05;

public class atividade08_Main {

    public static void main(String[] args) {

        atividade08 conta = new atividade08("0102-3", "Maria Souza");

        System.out.println("Conta: " + conta.getNumeroConta());
        System.out.println("Titular: " + conta.getNomeTitular());
        System.out.println("Saldo: R$ " + conta.getSaldo());

        conta.depositar(1200.50);
        conta.sacar(300.00);
        conta.alterarNome("Maria Souza Santos");

        System.out.println("Conta: " + conta.getNumeroConta());
        System.out.println("Titular: " + conta.getNomeTitular());
        System.out.println("Saldo: R$ " + conta.getSaldo());
    }
}