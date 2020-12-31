package pt.iade.unimanager_db.models;

import java.util.ArrayList;

public class Disciplinas {
    private int id;
    private String nome;
    private int creditos;
    private ArrayList<PlanosEstudo>planosEstudos;

    public Disciplinas(int id, String nome, int creditos, ArrayList<PlanosEstudo> planosEstudos) {
        this.id = id;
        this.nome = nome;
        this.creditos = creditos;
        this.planosEstudos = planosEstudos;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getCreditos() {
        return creditos;
    }

    public ArrayList<PlanosEstudo> getPlanosEstudos() {
        return planosEstudos;
    }

 
}
