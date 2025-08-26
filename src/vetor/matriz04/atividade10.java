package vetor.matriz04;

import java.util.Scanner;
public class atividade10 {
    public static void main (String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira uma data no formato dd/mm/aaaa: ");
        String data = in.nextLine();
        String[] separado = data.split("/");
        int dia = Integer.parseInt(separado[0]);
        int mes = Integer.parseInt(separado[1]);
        int ano = Integer.parseInt(separado[2]);
        if ((ano > 0) && (ano < 2025)) {
            if ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10) || (mes == 12)) {
                if ((dia > 0) && (dia <= 31)) {
                    System.out.println("Data válida.");
                } else {
                    System.out.println("Data inválida.");
                }
            } else if ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) {
                if ((dia > 0) && (dia <= 30)) {
                    System.out.println("Data válida.");
                } else {
                    System.out.println("Data inválida.");
                }
            } else if (mes == 2) {
                if ((dia > 0) && (dia <= 28)) {
                    System.out.println("Data válida.");
                } else {
                    System.out.println("Data inválida.");
                }
            } else {
                System.out.println("Data inválida.");
            }
        } else {
            System.out.println("Data inválida.");
        }
        int[] datas = new int[3];
        datas[0] = dia;
        datas[1] = mes;
        datas[2] = ano;


        in.close();
    }
}