package pt.iade.unimanager_db.models;

import java.util.ArrayList;

public class Cursos {
    private int id;
    private String nome;
    private ArrayList<Alunos>alunos;
    private ArrayList<PlanosEstudo>planosEstudos;

  
    public Cursos(int id, String nome, ArrayList<Alunos> alunos, ArrayList<PlanosEstudo> planosEstudos) {
        this.id = id;
        this.nome = nome;
        this.alunos = alunos;
        this.planosEstudos = planosEstudos;
    }

    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Alunos> getAlunos() {
        return alunos;
    }

    public ArrayList<PlanosEstudo> getPlanosEstudos() {
        return planosEstudos;
    }

 
}
