package pt.iade.unimanager_db.models;

import java.util.ArrayList;



public class Course {
    private int id;
    private String nome;
    private ArrayList<Student>students;
    private ArrayList<Plan>plans;

  
    public Course(int id, String nome, ArrayList<Student> students, ArrayList<Plan> plans) {
        this.id = id;
        this.nome = nome;
        this.students = students;
        this.plans = plans;
    }

    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Plan> getPlans() {
        return plans;
    }

 
}
