package estruturas.repeticao03;

public class atividade15 {
    public static void main(String[] args) {

        int m = 38;
        int n = 39;
        int soma = 0;

        for (int i = 1; i <= m; i++) {
            soma = soma + ((m - i )*(n - i)) / i;
        }

        System.out.println(soma);

    }
}