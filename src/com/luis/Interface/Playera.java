package com.luis.Interface;

/**
 * Created by luisb on 11/06/2017.
 *
 * Hereda de ropa
 */
public class Playera extends Ropa implements IDevolucion{

    private String corte;

    public Playera(int id, double precio, String talla, String color, String corte) {
        super(id, precio, talla, color);//Clase padre o superclase (constructor)
        /*
        * Empiezo a sobrescribir el metodo de la clase padre Ropa.
        * Tengo una variable corte que NO esta en el constructor heredado
        * Esto es POLIMORFISMO
        * */
        this.corte = corte;
    }

    public String getCorte() {
        return corte;
    }

    public void setCorte(String corte) {
        this.corte = corte;
    }

    @Override
    public void mostrarDatos(String nameClass) {
        super.mostrarDatos(nameClass);//aqui implementamos el resto de
        //recuerda que ya le paseste el parametro corte en el constructor
        System.out.println("Corte:" + corte);
    }

    @Override
    public void hacerDevolucion() {
        System.out.println("Devolucion Playera OK");
    }
}
