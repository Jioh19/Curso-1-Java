package org.example.conversor;

public class Moneda {

    private String nombre;
    private double tasa;
    private String sigla;

    public Moneda(String nombre, double tasa, String sigla) {
        this.nombre = nombre;
        this.tasa = tasa;
        this.sigla = sigla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return sigla;
    }
}
