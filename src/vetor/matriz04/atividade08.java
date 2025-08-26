package vetor.matriz04;

import java.util.Scanner;
import java.security.SecureRandom;

public class atividade08 {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        Scanner scanner = new Scanner(System.in);

        String vogais = "aeiou";
        String consoantes = "bcdfghjklmnpqrstvwxyz";

        System.out.print("Digite o tamanho desejado para a senha (maior que 0 e menor que 26): ");
        int tamanhoSenha = scanner.nextInt();

        if (tamanhoSenha <= 0 || tamanhoSenha >= (vogais.length() + consoantes.length())) {
            System.out.println("Tamanho inválido. O programa será encerrado.");
            scanner.close();
            return;
        }

        StringBuilder senhaGerada = new StringBuilder();

        for (int i = 0; i < tamanhoSenha; i++) {
            if (i % 2 == 0) {
                int indiceAleatorio = random.nextInt(consoantes.length());
                char consoanteAleatoria = consoantes.charAt(indiceAleatorio);
                senhaGerada.append(consoanteAleatoria);
            } else {
                int indiceAleatorio = random.nextInt(vogais.length());
                char vogalAleatoria = vogais.charAt(indiceAleatorio);
                senhaGerada.append(vogalAleatoria);
            }
        }

        System.out.println("\nSenha gerada com sucesso!");
        System.out.println("Sua senha é: " + senhaGerada.toString());

        scanner.close();
    }
}