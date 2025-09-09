package poo.basico05;

import java.util.Scanner;

public class atividade04_Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        atividade04 calculadora = new atividade04();

        System.out.println("Quanto você ganha por hora? R$: ");
        calculadora.setGanhoHora(input.nextDouble());

        System.out.println("Quantas horas você trabalhou no mês?");
        calculadora.setHorasTotal(input.nextDouble());

        input.close();

        double salarioBruto = calculadora.SalarioBruto();
        double descontoINSS = calculadora.valorDescontoINSS();
        double descontoIR = calculadora.valorDescontoIR();
        double descontoSINDICATO = calculadora.valorDescontoSINDICATO();
        double totalDescontos = calculadora.totalDesconto();
        double salarioLiquido = calculadora.SalarioLiquido();

        System.out.println("+ Salário Bruto       : R$"+ salarioBruto);
        System.out.println("- IR (11%)            : R$"+ descontoIR);
        System.out.println("- INSS (8%)           : R$"+ descontoINSS);
        System.out.println("- Sindicato (5%)      : R$"+ descontoSINDICATO);
        System.out.println("- Total de descontos  : R$"+ totalDescontos);
        System.out.println("= Salário Liquido     : R$"+ salarioLiquido);
    }
}
