package poo.basico05;

public class atividade06_Main {

    public static void main(String[] args) {

        atividade06 meuQuadrado = new atividade06();

        meuQuadrado.setLado(5.0);

        System.out.println("Tamanho do lado: " + meuQuadrado.getLado());
        System.out.println("Área do quadrado: " + meuQuadrado.calcularArea());

        meuQuadrado.setLado(10.0);
        System.out.println("\nNovo tamanho do lado: " + meuQuadrado.getLado());
        System.out.println("Nova área do quadrado: " + meuQuadrado.calcularArea());
    }
}