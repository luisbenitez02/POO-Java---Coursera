package com.luis.Interface;

/**
 * Created by luisb on 11/06/2017.
 *
 * Esta clase es la clase padre, contiene todas las variables y metodos
 * que usan las clases: playera, jeans y calcetin y que son comunes entre ellas
 */
public class Ropa {
    private int id;
    private double precio;
    private String talla;
    private String color;

    public Ropa(int id, double precio, String talla, String color) {
        this.id = id;
        this.precio = precio;
        this.talla = talla;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void mostrarDatos(String prenda){
        System.out.println("------" + prenda  + "------");
        System.out.println("ID: " + id);
        System.out.println("Precio: " + precio);
        System.out.println("Talla: " + talla);
        System.out.println("Color: " + color);
    }
}
