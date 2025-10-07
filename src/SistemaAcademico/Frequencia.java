package SistemaAcademico;

import java.util.List;
import java.util.Date;

public class Frequencia {

    private String data;
    private boolean presenca;
    private List<Professor> professores;
    private List<Aluno> alunos;

    public Frequencia(String data, boolean presenca, List<Professor> professores, List<Aluno> alunos) {
        this.data = data;
        this.presenca = presenca;
        this.professores = professores;
        this.alunos = alunos;
    }


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isPresenca() {
        return presenca;
    }

    public void setPresenca(boolean presenca) {
        this.presenca = presenca;
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

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Frequência [data=");
        builder.append(this.data);
        builder.append(", presencas=");
        builder.append(this.presenca);
        builder.append(", professores=");
        builder.append(this.professores);
        builder.append(", alunos=");
        builder.append(this.alunos);

        return builder.toString();
    }
}
