package vetor.matriz04;

import java.util.Scanner;

public class atividade05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int TAM = 20;
        Integer[] numeros = new Integer[TAM];
        Integer[] pares = new Integer[TAM];
        Integer[] impares = new Integer[TAM];

        System.out.println("Informe 20 números inteiros:");
        for (int i = 0; i < TAM; i++) {
            System.out.println("Informe o "+(i+1)+"º número:");
            int numero = input.nextInt();

            numeros[i] = numero;
            if(numero % 2 == 0){
                pares[i] = numero;
            } else {
                impares[i] = numero;
            }
        }

        System.out.println();

        System.out.println("Os números informados foram:");
        for (int i = 0; i < TAM; i++) {
            System.out.print("["+numeros[i]+"] ");
        }

        System.out.println();
        System.out.println();

        System.out.println("Os números pares informados foram:");
        for (int i = 0; i < TAM; i++) {
            if( pares[i] != null){
                System.out.print("["+pares[i]+"] ");
            }
        }

        System.out.println();
        System.out.println();

        System.out.println("Os números impares informados foram:");
        for (int i = 0; i < TAM; i++) {
            if(impares[i] != null){
                System.out.print("["+impares[i]+"] ");
            }
        }

        input.close();
    }
}