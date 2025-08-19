package estruturas.repeticao03;

import java.util.Scanner;
import java.text.DecimalFormat;

public class atividade03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        boolean verNome = false;
        boolean verIdade = false;
        boolean verSalario = false;
        boolean verSexo = false;
        boolean verCivil = false;

        String nome;
        int idade;
        double salario;
        String sexo;
        String civil;

        do {
            System.out.println("Informe seu nome (min.3 letras): ");
            nome = input.nextLine();
            if (nome.length() < 3) {
                System.out.println("Nome inválido! (menor que 3 caracteres).");
            } else {
                verNome = true;
            }
        } while (!verNome);

        do {
            System.out.println("Informe sua idade em anos (min.0 máx.150:");
            idade = input.nextInt();
            if (idade < 0 || idade > 150) {
                System.out.println("Idade inválida!");
            } else {
                verIdade = true;
            }
        } while (!verIdade);

        do {
            System.out.println("Informe seu salario em reais (min.0):");
            salario = input.nextDouble();
            if (salario < 0) {
                System.out.println("Salario invalido!");
            } else {
                verSalario = true;
            }
        } while (!verSalario);

        input.nextLine();

        do {
            System.out.println("Informe seu sexo (M/F):");
            sexo = input.nextLine();
            if (!sexo.equalsIgnoreCase("m") &&
                !sexo.equalsIgnoreCase("f") &&
                !sexo.equalsIgnoreCase("masculino") &&
                !sexo.equalsIgnoreCase("feminino")) {
                System.out.println("Sexo invalido!");
            } else {
                verSexo = true;
            }
        } while (!verSexo);

        do {
            System.out.println("Informe seu Estado Civil:");
            civil = input.nextLine();
            if (!civil.equalsIgnoreCase("s") &&
                    !civil.equalsIgnoreCase("c") &&
                    !civil.equalsIgnoreCase("v") &&
                    !civil.equalsIgnoreCase("d") &&
                    !civil.equalsIgnoreCase("solteiro") &&
                    !civil.equalsIgnoreCase("casado") &&
                    !civil.equalsIgnoreCase("viúvo") &&
                    !civil.equalsIgnoreCase("divorciado")) {
                System.out.println("Estado Civil invalido!");
            } else {
                verCivil = true;
            }
        } while (!verCivil);

        System.out.println("\nDados cadastrados com sucesso!");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$" + df.format(salario));
        System.out.println("Sexo: " + sexo.toUpperCase());
        System.out.println("Estado Civil: " + civil.toUpperCase());

        input.close();
    }
}