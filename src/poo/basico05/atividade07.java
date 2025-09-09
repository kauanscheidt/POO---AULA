package poo.basico05;

public class atividade07 {


    private String nome;
    private int idade;
    private double peso;
    private double altura;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void envelhecer() {
        if (this.idade < 21) {
            this.crescer(0.5);
        }
        this.idade++;
    }

    public void engordar(double quilos) {
        this.peso += quilos;
    }

    public void emagrecer(double quilos) {
        this.peso -= quilos;
    }

    public void crescer(double centimetros) {
        this.altura += centimetros;
    }
}