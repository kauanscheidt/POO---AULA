package vetor.matriz04;

import java.util.Scanner;

public class atividade07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int TAM = 5;
        Integer[] numeros = new Integer[TAM];
        int soma = 0;
        long produto = 1;

        System.out.println("Informe 5 números inteiros:");
            for(int i = 0; i < TAM; i++){
                System.out.println((i+1)+"º número:");
                numeros[i] = input.nextInt();

                soma += numeros[i];
                produto *= numeros[i];
            }

        System.out.println("Os números informados foram:");
            for(int i = 0; i < TAM; i++){
                System.out.print("["+(numeros[i])+"] ");
            }

        System.out.println();

        System.out.println("A soma destes números é: "+soma);
        System.out.println("O produto destes números é: "+produto);

        input.close();
    }
}
