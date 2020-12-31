package pt.iade.unimanager_db.models;

public class Plan {
    
    private Course courses;
    private Unit  units;
    private int semestre;

    public Plan(Course courses, Unit units, int semestre) {
        this.courses = courses;
        this.units = units;
        this.semestre = semestre;
    }

    public Course getCourse() {
        return courses;
    }

    public Unit getDisciplinas() {
        return units;
    }

    public int getSemestre() {
        return semestre;
    }


}
