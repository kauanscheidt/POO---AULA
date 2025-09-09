package poo.basico05;

import java.util.Scanner;

public class atividade03_Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        atividade03 calculadora = new atividade03();

        System.out.println("Digite o primeiro numero: ");
        calculadora.setNum1(input.nextInt());

        System.out.println("Digite o segundo numero: ");
        calculadora.setNum2(input.nextInt());

        System.out.println("Escolha uma operação:");
        System.out.println("[1] - Soma");
        System.out.println("[2] - Subtração");
        System.out.println("[3] - Multiplicação");
        System.out.println("[4] - Divisão");

        int escolha = input.nextInt();
        double resultado = 0;

        switch (escolha) {
            case 1:
                resultado = calculadora.somar();
                System.out.println("Resultado: " + resultado);
                break;

            case 2:
                resultado = calculadora.subtrair();
                System.out.println("Resultado: " + resultado);
                break;

            case 3:
                resultado = calculadora.multiplicar();
                System.out.println("Resultado: " + resultado);
                break;

            case 4:
                if (calculadora.dividir() == 0) {
                    System.out.println("Erro: Não é possível  dividir por zero.");
                } else {
                    resultado = calculadora.dividir();
                    System.out.println("Resultado: " + resultado);
                }
                break;

            default:
                System.out.println("Opção inválida! O programa será encerrado!");
                break;
        }

        input.close();
    }
}
