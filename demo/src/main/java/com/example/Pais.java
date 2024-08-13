package com.example;

public class Pais {
    private int id;
    private String nombrePais;
    private String capital;

    public Pais(int id, String nombrePais, String capital) {
        this.id = id;
        this.nombrePais = nombrePais;
        this.capital = capital;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Pais [id=" + id + ", nombrePais=" + nombrePais + ", capital=" + capital + "]";
    }
}
