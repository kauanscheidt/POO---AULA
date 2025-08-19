package estruturas.repeticao03;

import java.util.Scanner;

public class atividade16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int maior = -9999;
        int menor = 9999;
        int soma = 0;
        int num;

        System.out.println("Informe o tamanho do conjunto:");
        int tamanho = input.nextInt();

        for(int i = 1; i <= tamanho; i++){
            System.out.println("Informe o " +i+ "º número:");
            num = input.nextInt();

            if (num > maior){
                maior = num;
            }
            if (num < menor){
                menor = num;
            }

            soma = soma + num;
        }

        System.out.println("O menor número foi: "+menor);
        System.out.println("O maior número foi: "+maior);
        System.out.println("A soma foi: "+soma);
    }
}
