package pt.iade.unimanager_db.models;

import java.util.ArrayList;

public class Departamentos {
    private int id;
    private String nome;
    private char sigla;
    private ArrayList<Disciplinas>disciplinas;

   
    public Departamentos(int id, String nome, char sigla, ArrayList<Disciplinas> disciplinas) {
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
        this.disciplinas = disciplinas;
    }


    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public char getSigla() {
        return sigla;
    }

    public ArrayList<Disciplinas> getDisciplinas() {
        return disciplinas;
    }


}
