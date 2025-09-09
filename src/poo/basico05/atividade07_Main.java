package poo.basico05;

public class atividade07_Main {

    public static void main(String[] args) {
        atividade07 pessoa = new atividade07();

        pessoa.setNome("Carlos");
        pessoa.setIdade(19);
        pessoa.setPeso(75.0);
        pessoa.setAltura(180.0);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade() + " anos");
        System.out.println("Peso: " + pessoa.getPeso() + " kg");
        System.out.println("Altura: " + pessoa.getAltura() + " cm");

        pessoa.envelhecer();
        pessoa.envelhecer();
        pessoa.envelhecer();
        pessoa.engordar(5.0);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade() + " anos");
        System.out.println("Peso: " + pessoa.getPeso() + " kg");
        System.out.println("Altura: " + pessoa.getAltura() + " cm");
    }
}