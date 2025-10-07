package SistemaAcademico;

public class Professor {

    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Professor: [nomeProfessor=");
        builder.append(this.nome);
        builder.append("]");
        return builder.toString();
    }
}
