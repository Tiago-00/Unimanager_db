package pt.iade.unimanager_db.models;

import java.time.LocalDate;
import java.util.ArrayList;


public class Student {
    private int id;
    private String nome;
    private String local;
    private LocalDate dnsc;
    private char sexo;
    private String email;
    private ArrayList<Enrolment>enrolments;

    
    public Student(int id, String nome, String local, LocalDate dnsc, char sexo, String email,
            ArrayList<Enrolment> enrolments) {
        this.id = id;
        this.nome = nome;
        this.local = local;
        this.dnsc = dnsc;
        this.sexo = sexo;
        this.email = email;
        this.enrolments = enrolments;
    }


    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public LocalDate getDnsc() {
        return dnsc;
    }

    public char getSexo() {
        return sexo;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Enrolment> getEnrolments() {
        return enrolments;
    }
  
}
