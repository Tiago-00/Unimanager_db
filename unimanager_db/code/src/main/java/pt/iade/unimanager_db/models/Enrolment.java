package pt.iade.unimanager_db.models;

import java.time.LocalDate;

public class Enrolment {
    
    private int id;
    private Student students;
    private Course courses;
    private Unit units;
    private LocalDate data_inscricao;
    private LocalDate data_avaliacao;
    private double nota;

    public Enrolment(int id, Student students, Course courses, Unit units, LocalDate data_inscricao,
            LocalDate data_avaliacao, double nota) {
        this.id = id;
        this.students = students;
        this.courses = courses;
        this.units = units;
        this.data_inscricao = data_inscricao;
        this.data_avaliacao = data_avaliacao;
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public Student getStudents() {
        return students;
    }

    public Course getCourses() {
        return courses;
    }

    public Unit getUnits() {
        return units;
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
