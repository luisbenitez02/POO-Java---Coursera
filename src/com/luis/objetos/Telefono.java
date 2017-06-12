package com.luis.objetos;

/**
 * Created by luisb on 5/06/2017.
 */
public class Telefono {

    //atributos
    private int id;//private: solo accesibles desde esta clase
    private String marca;
    String modelo;
    private double precio;

    //metodo constructor

    public Telefono(){
        this.id=0;
        this.marca = "Generico";
        this.modelo = "N/A";
        this.precio = 180000;
    }

    public Telefono(int id, String marca, double precio){
        this.id=id;
        this.marca = marca;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {//PARA ESO SIRVE LOS GETS Y SETS, Para validaciones y codigo extra de seguridad
        if (precio>50000){
            this.precio = precio;
        }else{
            this.precio = 50000;
        }
    }

    //comportamientos o metodos
    public void mostrarDatos(){
        System.out.println("-------Datos Telefono------");
        System.out.println("ID: " + id);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: " + precio);

    }
}
