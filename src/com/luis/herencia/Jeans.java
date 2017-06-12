package com.luis.herencia;

/**
 * Created by luisb on 11/06/2017.
 *
 * Hereda de ropa
 */
public class Jeans extends Ropa{

    private String corte;
    private char genero;

    public Jeans(int id, double precio, String talla, String color, String corte, char genero) {
        super(id, precio, talla, color);

        this.corte = corte;
        this.genero = genero;
    }


    public String getCorte() {
        return corte;
    }

    public void setCorte(String corte) {
        this.corte = corte;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public void mostrarDatos(String nameClass) {
        super.mostrarDatos(nameClass);

        System.out.println("Corte:" + corte);
        System.out.println("Genero:" + genero);
    }
}
