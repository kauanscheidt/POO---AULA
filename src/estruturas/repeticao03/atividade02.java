package estruturas.repeticao03;

import java.util.Scanner;

public class atividade02 {
    public static void main(String[] args ) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o usuário:");
        String usuario = input.nextLine();
        String senha;

        do {
            System.out.println("Insira a senha:");
            senha = input.nextLine();
                if (senha.equalsIgnoreCase(usuario)){
                    System.out.println("ERRO! A senha não pode ser igual ao usuário");
                }
        } while (senha.equalsIgnoreCase(usuario));

        System.out.println("Usuário cadastrado com sucesso");

        input.close();

    }
}
