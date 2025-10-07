package SistemaAcademico;

import java.util.List;

public class Avaliacao {

    private String tipo;
    private float nota;
    private List<Professor> professores;
    private List<Aluno> alunos;

    public Avaliacao(String tipo, float nota, List<Professor> professores,  List<Aluno> alunos ) {
        this.tipo = tipo;
        this.nota = nota;
        this.professores = professores;
        this.alunos = alunos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Float getNota() {
        return nota;
    }

    public void setNota(Float nota) {
        this.nota = nota;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Avaliaçao [tipo=");
        builder.append(this.tipo);
        builder.append(", nota=");
        builder.append(this.nota);
        builder.append(", professores=");
        builder.append(this.professores);
        builder.append(", alunos=");
        builder.append(this.alunos);
        builder.append("]");
        return builder.toString();
    }
}
