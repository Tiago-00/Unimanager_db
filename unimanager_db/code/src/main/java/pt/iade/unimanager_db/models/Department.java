package pt.iade.unimanager_db.models;

import java.util.ArrayList;

public class Department {
    private int id;
    private String nome;
    private char sigla;
    private ArrayList<Unit>units;

   
    public  Department(int id, String nome, char sigla, ArrayList<Unit> units) {
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
        this.units = units;
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

    public ArrayList<Unit> getUnits() {
        return units;
    }

}
