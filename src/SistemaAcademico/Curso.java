package SistemaAcademico;

import java.util.List;

public class Curso {

    private String nome;
    private List<Professor> professores;
    private List<Aluno> alunos;
    private List<Fase> fases;

    public Curso(String nome, List<Professor> professores, List<Aluno> alunos, List<Fase> fases) {
        this.nome = nome;
        this.professores = professores;
        this.alunos = alunos;
        this.fases = fases;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public List<Fase> getFases() {
        return fases;
    }

    public void setFases(List<Fase> fases) {
        this.fases = fases;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Curso: [nome=");
        builder.append(this.nome);
        builder.append(", professores=");
        builder.append(this.professores);
        builder.append(", alunos=");
        builder.append(this.alunos);
        builder.append(", fases=");
        builder.append(this.fases);
        builder.append("]");
        return builder.toString();
    }
}
