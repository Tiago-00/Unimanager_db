package pt.iade.unimanager_db.models;

import java.time.LocalDate;

public class Inscricoes {
    
    private int id;
    private Alunos alunos;
    private Cursos cursos;
    private Disciplinas disciplinas;
    private LocalDate data_inscricao;
    private LocalDate data_avaliacao;
    private double nota;

    public Inscricoes(int id, Alunos alunos, Cursos cursos, Disciplinas disciplinas, LocalDate data_inscricao,
            LocalDate data_avaliacao, double nota) {
        this.id = id;
        this.alunos = alunos;
        this.cursos = cursos;
        this.disciplinas = disciplinas;
        this.data_inscricao = data_inscricao;
        this.data_avaliacao = data_avaliacao;
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public Alunos getAlunos() {
        return alunos;
    }

    public Cursos getCursos() {
        return cursos;
    }

    public Disciplinas getDisciplinas() {
        return disciplinas;
    }

    public LocalDate getData_inscricao() {
        return data_inscricao;
    }

    public LocalDate getData_avaliacao() {
        return data_avaliacao;
    }

      public double getNota() {
        return nota;
    }
    
}
