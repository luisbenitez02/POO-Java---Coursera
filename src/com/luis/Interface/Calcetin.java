package com.luis.Interface;

/**
 * Created by luisb on 11/06/2017.
 *
 * Hereda de ropa
 */
public class Calcetin extends Ropa implements IDevolucion{

    public Calcetin(int id, double precio, String talla, String color) {

        super(id, precio, talla, color);
    }

    @Override
    public void hacerDevolucion() {
        System.out.println("Devolucion Calcetines OK");
    }
}
