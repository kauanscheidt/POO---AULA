package SistemaAcademico;

import java.util.List;
import java.util.ArrayList;

public class SIstemaAcademicoMain {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Kauan");
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno);

        Professor professor = new Professor("Juliano");
        List<Professor> professores = new ArrayList<>();
        professores.add(professor);

        Avaliacao avaliacao = new Avaliacao("Prova 1", 8, professores, alunos);
        List<Avaliacao> avaliacoes = new ArrayList<>();
        avaliacoes.add(avaliacao);

        Frequencia frequencia = new Frequencia("07/10/2025", true, professores, alunos);
        List<Frequencia> frequencias = new ArrayList<>();
        frequencias.add(frequencia);

        Disciplina disciplina = new Disciplina("POO", frequencias, avaliacoes, professores, alunos);
        List<Disciplina> disciplinas = new ArrayList<>();
        disciplinas.add(disciplina);

        Fase fase = new Fase(2, disciplinas);
        List<Fase> fases = new ArrayList<>();
        fases.add(fase);

        Situacao situacao = new Situacao(alunos, disciplinas);
        List<Situacao> situacoes = new ArrayList<>();
        situacoes.add(situacao);

        Curso curso = new Curso("BCC", professores, alunos, fases);
        List<Curso> cursos = new ArrayList<>();
        cursos.add(curso);

        System.out.println(curso);
        System.out.println(situacao);
    }
}
