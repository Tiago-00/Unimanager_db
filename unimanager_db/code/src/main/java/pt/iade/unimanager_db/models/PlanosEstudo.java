package pt.iade.unimanager_db.models;

public class PlanosEstudo {
    
    private  Cursos cursos;
    private  Disciplinas  disciplinas;
    private int semestre;

    public PlanosEstudo(Cursos cursos, Disciplinas disciplinas, int semestre) {
        this.cursos = cursos;
        this.disciplinas = disciplinas;
        this.semestre = semestre;
    }

    public Cursos getCursos() {
        return cursos;
    }

    public Disciplinas getDisciplinas() {
        return disciplinas;
    }

    public int getSemestre() {
        return semestre;
    }


}
